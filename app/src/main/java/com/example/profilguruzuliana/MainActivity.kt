package com.example.profilguruzuliana

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button2)

        btn.setOnClickListener {

            val Intent = Intent( this, MainActivity2::class.java)
        startActivity(Intent)
        }
    }
}