package com.example.calculadora

import Calculadora
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var txtNum1: EditText
    lateinit var txtNum2: EditText
    lateinit var btnSumar: Button
    lateinit var minus: Button
    lateinit var multiply: Button
    lateinit var divide: Button
    lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNum1 = findViewById(R.id.txtNum1)
        txtNum2 = findViewById(R.id.txtNum2)
        btnSumar = findViewById(R.id.btnSumar)
        minus = findViewById(R.id.minus)
        multiply = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)
        txtResultado = findViewById(R.id.txtResultado)


        btnSumar.setOnClickListener{
            val valor1 = txtNum1.text.toString().toDouble()
            val valor2 = txtNum2.text.toString().toDouble()
            val calculadora = Calculadora(valor1, valor2)

            val resultado = calculadora.Suma()
            txtResultado.text = resultado.toString()


        }

        minus.setOnClickListener{
            val valor1 = txtNum1.text.toString().toDouble()
            val valor2 = txtNum2.text.toString().toDouble()
            val calculadora = Calculadora(valor1, valor2)
            val resultado = calculadora.subtract()
            txtResultado.text = resultado.toString()
        }

        multiply.setOnClickListener {
            val valor1 = txtNum1.text.toString().toDouble()
            val valor2 = txtNum2.text.toString().toDouble()
            val calculadora = Calculadora(valor1, valor2)
            val resultado = calculadora.multiply()
            txtResultado.text = resultado.toString()
        }

        divide.setOnClickListener{
            val valor1 = txtNum1.text.toString().toDouble()
            val valor2 = txtNum2.text.toString().toDouble()
            val calculadora = Calculadora(valor1, valor2)
            if(valor2==0.0){
                txtNum2.setText("Error division entre 0")
                txtNum2.requestFocus()
            }else {
                val resultado = calculadora.divide()
                val df = DecimalFormat("#.##")
                df.roundingMode = RoundingMode.DOWN
                val roundoff = df.format(resultado)
                txtResultado.text = roundoff.toString()
            }
        }

    }
}