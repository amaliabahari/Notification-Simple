package com.example.android.yogatimernotifications

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.eggtimernotifications.ui.EggTimerFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, YogaTimerFragment.newInstance())
                .commitNow()
        }
    }
}