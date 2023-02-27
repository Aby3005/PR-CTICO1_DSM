package com.example.myapplicationpractica05recursos01

import com.example.myapplicationpractica05recursos01.Empleados
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Empleado : AppCompatActivity() {
    lateinit var txtNombre :EditText
    lateinit var txtSalarioBase : EditText
    lateinit var btnCalcular : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empleado)

        txtNombre = findViewById(R.id.txtNombre)
        txtSalarioBase = findViewById(R.id.txtSalarioBase)
        btnCalcular = findViewById(R.id.btnCalcular)
        txtResultado = findViewById(R.id.txtResultado)


        btnCalcular.setOnClickListener{
            val nombre = txtNombre.text.toString()
            val salarioBase = txtSalarioBase.text.toString().toDouble()

            val empleado = Empleados(nombre, salarioBase)
            val salarioNeto = empleado.CalcularSalarioNeto()

            txtResultado.text = "El salario neto de $nombre es: $$salarioNeto"
        }
    }

}