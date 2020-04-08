package com.smartherd.msgshareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intentBundle: Bundle? = intent.extras
        val usMsg = intentBundle!!.getString("userMsg")
        txvUserMessage.text = usMsg
    }
}