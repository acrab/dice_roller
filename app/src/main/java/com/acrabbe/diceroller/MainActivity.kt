package com.acrabbe.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val text: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6)+1
        text.text = randomInt.toString()
    }
}
