package com.element196.utils

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import com.element196.utils.element.Naming
import com.element196.utils.gis.Hilp
import com.element196.utils.leta.Control
import com.element196.utils.leta.Control.mainControl
import com.element196.utils.leta.baner
import com.element196.utils.leta.saiMyName
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.gson.Gson
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.*


class BopaView : ViewModel() {

    suspend fun asset(context: Activity) {
        baner(context)
        Control.contr.collect {
            when (it == "null") {
                true -> {
                    val nm: Naming? = vorshav(context)
                    assetFunMain(context, it, nm)
                }
                false -> assetFunMain(context, it, null)
            }
        }
    }

    private suspend fun assetFunMain(context: Activity, fios: String, nm: Naming?) {
        val gadid = jifer(context)
        OneSignal.setExternalUserId(gadid)
        val time = TimeZone.getDefault().id
        val koba = Hilp(context.application.resources)
        if (fios == "null") {
            val resultF = nm?.let { "Facebook Naming" } ?: "null"
            val resultU = nm?.let { UUID.randomUUID().toString() } ?: "null"
            mainControl.emit(koba.ios(gadid, fios, resultF, nm, resultU, time))
        } else {
            val resultF = "deeplink"
            val resultU = "null"
            mainControl.emit(koba.ios(gadid, fios, resultF, nm, resultU, time))
        }
    }

    private suspend fun jifer(context: Activity): String {
        val gadid = withContext(Dispatchers.Default) {
            AdvertisingIdClient.getAdvertisingIdInfo(
                context
            ).id.toString()
        }
        return gadid
    }

    private suspend fun vorshav(context: Activity): Naming? {
        val nm: Naming? =
            if (saiMyName(context).toString() != "null") Gson().fromJson(
                saiMyName(context),
                Naming::class.java
            ) else null
        return nm
    }
}