package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        val diceL = Dice(6)
        val diceR = Dice(6)
        val diceRollL = diceL.roll()
        val diceRollR = diceR.roll()
        val diceImageL: ImageView = findViewById(R.id.imageView)
        val diceImageR: ImageView = findViewById(R.id.imageView4)

        val drawableResourceL = when (diceRollL) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResourceR = when (diceRollR) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageL.setImageResource(drawableResourceL)
        diceImageL.contentDescription = diceRollL.toString()
        diceImageR.setImageResource(drawableResourceR)
        diceImageR.contentDescription = diceRollR.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}