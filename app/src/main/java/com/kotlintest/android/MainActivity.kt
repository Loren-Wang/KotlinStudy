package com.kotlintest.android

import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTestMessage.text = "bingo bingo"
        tvContent.addView(layoutInflater.inflate(R.layout.activity_test,null))
        tvTest.text = "lalalallalal"

    }

}
