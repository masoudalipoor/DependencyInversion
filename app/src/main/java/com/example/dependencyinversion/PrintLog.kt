package com.example.dependencyinversion

import android.util.Log
import java.io.IOException

/**
 *
 *  just for print log on logcat
 */

class PrintLog: Logger {

    override fun logInformation(information: String) {
        Log.i("PrintLog-logInformation", information)
    }

    override fun logException(ex: IOException) {
        Log.i("PrintLog-logException", ex.toString())
    }

    override fun logMessage(message: String) {
        Log.i("PrintLog-logMessage", message)
    }
}