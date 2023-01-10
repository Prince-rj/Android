package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll)
        rollButton.setOnClickListener {
            val toast= Toast.makeText(this,"Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            val d=Dice()
            val resultimageView: ImageView = findViewById(R.id.imageView)
            when(d.roll()){
                1->resultimageView.setImageResource(R.drawable.dice_1)
                2->resultimageView.setImageResource(R.drawable.dice_2)
                3->resultimageView.setImageResource(R.drawable.dice_3)
                4->resultimageView.setImageResource(R.drawable.dice_4)
                5->resultimageView.setImageResource(R.drawable.dice_5)
                6->resultimageView.setImageResource(R.drawable.dice_6)

            }

        }

    }
}
class Dice {
    var diceSides = 6
    fun roll(): Int {
     val i= IntRange(start = 1, endInclusive = 6)
        val j= i.random()
        return j
    }
}