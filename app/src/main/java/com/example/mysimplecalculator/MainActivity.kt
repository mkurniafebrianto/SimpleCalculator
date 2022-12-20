package com.example.mysimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add sum feature
        btn_plus.setOnClickListener() {
            check(first_number_input.text.toString(), second_number_input.text.toString(), '+')
        }

        // add subtract feature
        btn_minus.setOnClickListener() {
            check(first_number_input.text.toString(), second_number_input.text.toString(), '-')
        }

        // add multiplication feature
        btn_multiple.setOnClickListener() {
            check(first_number_input.text.toString(), second_number_input.text.toString(), '*')
        }

    }

    // define function check
    private fun check(firstNum: String, secondNum: String, operator: Char) {
        if (firstNum.isEmpty()) {
            first_number_input.error = "Add a Number!"
        } else if (secondNum.isEmpty()) {
            second_number_input.error = "Add a Number!"
        } else if (firstNum.isNotEmpty() && secondNum.isNotEmpty()) {
            count(firstNum.toDouble(), secondNum.toDouble(), operator)
        }
    }

    // define function count
    private fun count(firstNum: Double, secondNum: Double, operator: Char) {
        var result = 0.0
        when (operator) {
            '+' -> result = firstNum + secondNum
            '-' -> result = firstNum - secondNum
            '*' -> result = firstNum * secondNum
        }
        tv_result.text = result.toString()
    }

}