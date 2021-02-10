package com.example.textcalc

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //ここから追加
    fun button1_click(view: View?) {
        val editText1 = findViewById<View>(R.id.editTextNumber) as EditText
        val editText2 = findViewById<View>(R.id.editTextNumber2) as EditText
        val a = editText1.text.toString().toInt()
        val b = editText2.text.toString().toInt()
        val c = a + b
        val textView1 = findViewById<View>(R.id.textView) as TextView
        textView1.text = c.toString()
    }

    fun button2_click(view: View?) {
        val editText1 = findViewById<View>(R.id.editTextNumber) as EditText
        val editText2 = findViewById<View>(R.id.editTextNumber2) as EditText
        val a = editText1.text.toString().toInt()
        val b = editText2.text.toString().toInt()
        val c = a - b
        val textView1 = findViewById<View>(R.id.textView) as TextView
        textView1.text = c.toString()
    }
}