package com.element196.utils.leta

import android.app.Activity
import com.fmb.conversion.ConvClass

suspend fun saiMyName(context: Activity) = ConvClass.getAttData(
    context, "be038419ea3043d383f74b01135da93af11317effc49c6431f993966be21f904"
)