package com.element196.utils.leta

import android.app.Activity
import com.element196.utils.leta.Control.contr
import com.facebook.applinks.AppLinkData
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@OptIn(DelicateCoroutinesApi::class)
fun baner(activity:Activity){
    AppLinkData.fetchDeferredAppLinkData(activity.application) { fghjjjjfrgr ->
        GlobalScope.launch {
            val hopfse = frgre(fghjjjjfrgr).toString()
            contr.emit(hopfse)
        }
    }
}

private fun frgre(fghjjjjfrgr: AppLinkData?) = fghjjjjfrgr?.targetUri