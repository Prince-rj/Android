package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast.makeText as Toast.makeText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_clickMe=findViewById(R.id.button)as Button
        val textView=findViewById(R.id.text) as TextView
        val e1=findViewById(R.id.e1) as EditText
        val e2=findViewById(R.id.e2) as EditText
        var x =0
        var y=e1
        var z=e2
        
        btn_clickMe.setOnClickListener{
            val toast= Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()


        }
    }
}