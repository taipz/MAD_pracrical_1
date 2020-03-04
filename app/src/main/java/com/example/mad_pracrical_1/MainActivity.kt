package com.example.mad_pracrical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {
        //val resultText: TextView = findViewById(R.id.textView2)
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        //resultText.text = "Dice Rolled"
        //resultText.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.textView2)

        if(resultText.text == "Hello World!"){
            resultText.text = "1"
        }else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}
