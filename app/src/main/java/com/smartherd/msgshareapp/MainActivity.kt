package com.smartherd.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "Przycisk zostal wcisniety")
            Toast.makeText(this, "Buttons", Toast.LENGTH_SHORT).show()

        }

        btnStartSecondActivity.setOnClickListener {
            val message = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }
    }

}

//blah