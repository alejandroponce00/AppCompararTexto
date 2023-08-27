package com.curso.android.prueba

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
//ALejandro Ponce
class MainActivity : ComponentActivity() {
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.textView)
        input2 = findViewById(R.id.textView2)
        resultTextView = findViewById(R.id.textViewresult)

        val compareButton = findViewById<Button>(R.id.buttonCompare)
        compareButton.setOnClickListener {
            compareTextsAndPrint(input1.text.toString(), input2.text.toString())
        }
    }

    fun compareTextsAndPrint(text1: String, text2: String) {
        val areEqual = text1 == text2
        val message = if (areEqual) {
            "Los textos son iguales"
        } else {
            "Los textos no son iguales"
        }
        resultTextView.text = message
    }
}
