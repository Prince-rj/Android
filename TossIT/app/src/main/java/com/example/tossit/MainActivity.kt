package com.example.tossit

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tossButton : Button = findViewById(R.id.button)
        tossButton.setOnClickListener {
            val toast = Toast.makeText(this,"Coin Flipped",Toast.LENGTH_SHORT)
            toast.show()
            val c= Coin()
            val resultimageView : ImageView = findViewById(R.id.imageView)
            when(c.Toss()){
                1-> resultimageView.setImageResource(R.drawable.coin1)
                2-> resultimageView.setImageResource(R.drawable.coin2)

            }
        }

    }
}
class Coin{
    fun Toss(): Int {
        val toss=(1..2).random()
        return toss
    }
}