package com.jaygohel.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 : EditText = findViewById(R.id.num1)
        val num2 : EditText = findViewById(R.id.num2)

        var ans: TextView = findViewById(R.id.ans)

        val add : Button = findViewById(R.id.add)
        val sub : Button = findViewById(R.id.sub)
        val mul : Button = findViewById(R.id.mul)
        val div : Button = findViewById(R.id.div)

        add.setOnClickListener(){
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val value = val1 + val2
            ans.setText(value.toString().toInt())
        }

        sub.setOnClickListener(){
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val value = val1 - val2
            ans.setText(value.toString().toInt())
        }

        mul.setOnClickListener(){
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val value = val1 * val2
            ans.setText(value.toString().toInt())
        }

        div.setOnClickListener(){
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val value = val1 / val2
            ans.setText(value.toString().toInt())
        }
    }

}