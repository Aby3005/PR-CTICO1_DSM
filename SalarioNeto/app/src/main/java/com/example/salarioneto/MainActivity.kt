package com.example.salarioneto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtNombre :EditText
    lateinit var txtSalarioBase : EditText
    lateinit var btnCalcular : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.txtNombre)
        txtSalarioBase = findViewById(R.id.txtSalarioBase)
        btnCalcular = findViewById(R.id.btnCalcular)
        txtResultado = findViewById(R.id.txtResultado)


        btnCalcular.setOnClickListener(View.OnClickListener {

            val SalBase = txtSalarioBase.text.toString().toDouble()
            val Nombre = txtNombre.text.toString()

            txtResultado.text = "El Salario neto de $Nombre es: " + "$" + CalcularSalario(SalBase)
        })
    }

    fun CalcularSalario(SalarioBase : Double) : String {
        val isss = SalarioBase * 0.03
        val afp = SalarioBase * 0.04
        val renta = SalarioBase * 0.05

        val deducciones = isss+afp+renta
        val SalarioNeto = SalarioBase-deducciones
        return SalarioNeto.toString()
    }
}