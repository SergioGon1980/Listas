package com.SergioGon1980.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jocnunez.listas.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("debug", "OnCreate MainActivity")
    }
}