package com.element196.utils

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.element196.utils.element.GOpd
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
                    val nm: GOpd? = vorshav(context)
                    assetFunMain(context, it, nm)
                }
                false -> assetFunMain(context, it, null)
            }
        }
    }
    val dewf = "key2"
    private suspend fun assetFunMain(context: Activity, fios: String, nm: GOpd?) {
        val gtr = jifer(context)
        OneSignal.setExternalUserId(gtr)
        val time = TimeZone.getDefault().id
        val koba = Hilp(context.application.resources)
        OneSignal.initWithContext(context)
        OneSignal.setAppId("e21b9579-844a-449a-ad6a-d36524109ccc")
        val fref = nm?.gsd.toString()
        dwegfewrgerger(fios,fref)
        if (fios == "null") {
            val resultF = nm?.let { "Facebook Naming" } ?: "null"
            val resultU = nm?.let { UUID.randomUUID().toString() } ?: "null"
            mainControl.emit(koba.ios(gtr, fios, resultF, nm, resultU, time))
        } else {
            val resultF = "deeplink"
            val resultU = "null"
            mainControl.emit(koba.ios(gtr, fios, resultF, nm, resultU, time))
        }
    }
    private fun dwegfewrgerger(Dwefwe: String, dwef:String) {
        if (wefre(dwef, Dwefwe)) {
            OneSignal.sendTag(dewf, "organic")
        } else if (Dwefwe != "null") {
            OneSignal.sendTag(dewf, Dwefwe.replace("myapp://", "").substringBefore("/"))
        } else if (dwef != "null") {
            OneSignal.sendTag(dewf, dwef.substringBefore("_"))
        }
    }

    private fun wefre(dewf: String, data2: String) = dewf == "null" && ewf(data2)

    private fun ewf(data2: String) = data2 == "null"
    private suspend fun jifer(context: Activity): String {
        val fregerg = withContext(Dispatchers.Default) {
            AdvertisingIdClient.getAdvertisingIdInfo(
                context
            ).id.toString()
        }
        return fregerg
    }

    private suspend fun vorshav(context: Activity): GOpd? {
        return if (saiMyName(context).toString() != "null") Gson().fromJson(
            saiMyName(context),
            GOpd::class.java
        ) else null
    }
}