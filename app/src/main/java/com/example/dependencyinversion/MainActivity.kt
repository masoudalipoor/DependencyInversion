package com.example.dependencyinversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var log: LogContext ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        log = LogContext(PrintLog())
        log?.addInformation("onCreate")
    }

    override fun onStart() {
        super.onStart()
        log?.addInformation("onStart")
    }

    override fun onPause() {
        super.onPause()
        log?.addInformation("onPause")
    }

    override fun onStop() {
        super.onStop()
        log?.addInformation("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        log?.addInformation("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        log?.addInformation("onDestroy")
    }
}