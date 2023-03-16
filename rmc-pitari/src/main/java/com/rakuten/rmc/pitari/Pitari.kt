package com.rakuten.rmc.pitari

import com.rakuten.rmc.NetworkUtil

class Pitari {
    fun testMethodPitari(onCompleteListener: OnCompleteListener) {
        NetworkUtil.getRequest(object : NetworkUtil.NetworkRequestListener {
            override fun onComplete() {
                super.onComplete()
                onCompleteListener.onComplete(true)
            }
        })
    }

    interface OnCompleteListener {
        fun onComplete(isSuccess: Boolean)
    }
}