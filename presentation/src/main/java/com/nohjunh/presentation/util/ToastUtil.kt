package com.nohjunh.presentation.util

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun shortShowToast(context: Context, msg: String) =
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
