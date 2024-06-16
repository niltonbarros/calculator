package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Converter Dados digitado
        val valor1 = findViewById<EditText>(R.id.edtValor1)
        val valor2 = findViewById(R.id.edtValor2) as EditText
        val total = findViewById(R.id.editTextResult) as EditText
        val btnSomar = findViewById(R.id.btnSomar) as Button
        val btnSub = findViewById<Button>(R.id.button2)
        val btnMult = findViewById<Button>(R.id.button3)
        val btnDiv = findViewById<Button>(R.id.button4)


        //Função do botão Somar
        btnSomar.setOnClickListener(){
            val val1 = valor1.text.toString().toFloat()
            val val2 = valor2.text.toString().toFloat()

            val result = val1 + val2

            total.setText(result.toString())
        }

        //Função do botão Subtrair
        btnSub.setOnClickListener(){
            val val1 = valor1.text.toString().toFloat()
            val val2 = valor2.text.toString().toFloat()

            val result = val1 - val2

            total.setText(result.toString())
        }

        //Função do botão Multiplicar
        btnMult.setOnClickListener(){
            val val1 = valor1.text.toString().toFloat()
            val val2 = valor2.text.toString().toFloat()

            val result = val1 * val2

            total.setText(result.toString())
        }

        //Função do botão Dividir
        btnDiv.setOnClickListener(){
            val val1 = valor1.text.toString().toFloat()
            val val2 = valor2.text.toString().toFloat()

            val result = val1 / val2

            total.setText(result.toString())
        }


    }
}