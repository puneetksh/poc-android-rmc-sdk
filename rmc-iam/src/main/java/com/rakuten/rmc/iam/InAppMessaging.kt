package com.rakuten.rmc.iam

import android.content.Context
import com.rakuten.rmc.NetworkUtil
import com.rakuten.rmc.ui.ProgressUtil

class InAppMessaging {
    fun testMethodIam(context: Context) {
        ProgressUtil.showInProgress(context)
        NetworkUtil.getRequest(object : NetworkUtil.NetworkRequestListener {
            override fun onComplete() {
                super.onComplete()
                ProgressUtil.showCompleted(context)
            }
        })
    }

    interface OnCompleteListener {
        fun onComplete(isSuccess: Boolean)
    }
}