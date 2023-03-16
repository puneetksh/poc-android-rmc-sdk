package com.rakuten.rmc

import android.os.Handler

object NetworkUtil {

    fun getRequest(networkRequestListener: NetworkRequestListener) {
        Handler().postDelayed({ networkRequestListener.onComplete() }, 5000)
    }

    interface NetworkRequestListener {
        fun onComplete() {

        }
    }
}