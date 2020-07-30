package com.eahm.launchscreenexperiments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme) // set the default android app theme
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}