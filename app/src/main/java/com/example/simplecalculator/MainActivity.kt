package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val intent = Intent(this, ResultActivity2::class.java)
        val addBtn: Button = findViewById(R.id.btnAddition)
        val sbtBtn: Button = findViewById(R.id.btnSubtraction)
        val mulBtn: Button = findViewById(R.id.btnMultiply)
        val divBtn: Button = findViewById(R.id.btnDivision)

        addBtn.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber + secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }


        sbtBtn.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber - secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }

        mulBtn.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber * secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }
        divBtn.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            if (secondNumber == 0) {
                Toast.makeText(this, "Can not divide by 0", Toast.LENGTH_SHORT).show()
            } else {
                val res: Double = firstNumber / secondNumber
                val dec = DecimalFormat("#.00")
                val formatted = dec.format(res).toDouble()
                intent.putExtra("res", formatted)
                startActivity(intent)
            }
        }
    }
}