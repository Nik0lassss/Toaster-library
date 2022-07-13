package com.nikolay.chyrkevich.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastMessenger {
    companion object {

        fun print(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}
