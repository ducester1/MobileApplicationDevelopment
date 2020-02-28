package com.example.level1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            submit()
        }
    }

    private fun submit() {
        var amountCorrect = 0
        if(TTC(tvA1.text.toString(),tvB1.text.toString(),ptAB1.text.toString())) amountCorrect++
        if(TTC(tvA2.text.toString(),tvB2.text.toString(),ptAB2.text.toString())) amountCorrect++
        if(TTC(tvA3.text.toString(),tvB3.text.toString(),ptAB3.text.toString())) amountCorrect++
        if(TTC(tvA4.text.toString(),tvB4.text.toString(),ptAB4.text.toString())) amountCorrect++

        Toast.makeText(this, "The correct number of answers is: $amountCorrect", Toast.LENGTH_SHORT).show()
    }

    private fun TTC(A: String , B: String, AB: String):Boolean {
        var correct = true
        var answer = "T"

        if (A == "T" && B == "T") answer = "T"
        else answer = "F"

        correct = answer == AB

        if (AB != "T" && AB != "F") correct = false
        return correct
    }
}
