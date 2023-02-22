package com.element196.utils.leta

import kotlinx.coroutines.flow.MutableSharedFlow

object Control {
    val contr = MutableSharedFlow<String>()
    val mainControl = MutableSharedFlow<String>()
}