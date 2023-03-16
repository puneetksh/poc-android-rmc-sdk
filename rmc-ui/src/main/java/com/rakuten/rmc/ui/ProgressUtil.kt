package com.rakuten.rmc.ui

import android.content.Context
import android.widget.Toast

object ProgressUtil {

    fun showInProgress(context: Context){
        Toast.makeText(context,"Please wait.. (rmc-ui)",Toast.LENGTH_LONG).show()
    }

    fun showCompleted(context: Context){
        Toast.makeText(context,"Task completed.. (rmc-ui)",Toast.LENGTH_LONG).show()
    }
}