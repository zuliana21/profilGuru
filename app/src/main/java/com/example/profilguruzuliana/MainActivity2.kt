package com.example.profilguruzuliana

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn = findViewById<ImageView>(R.id.ok)
        val btn2 = findViewById<ImageView>(R.id.potensi)

        btn.setOnClickListener {

            val Intent = Intent( this, MainActivity3::class.java)
            startActivity(Intent)

        }
        btn2.setOnClickListener {

            val Intent = Intent( this, MainActivity4::class.java)
            startActivity(Intent)
        }
    }
}