package com.yastyas.uts_profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCP: TextView = findViewById(R.id.tv_cp)
        tvCP.movementMethod = LinkMovementMethod.getInstance()
    }
}