package com.example.promedioestudiante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txtNombre: EditText
    lateinit var txtNota1: EditText
    lateinit var txtNota2: EditText
    lateinit var txtNota3: EditText
    lateinit var txtNota4: EditText
    lateinit var txtNota5: EditText
    lateinit var btnPromedio: Button
    lateinit var txtPromedio: TextView
    lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre = findViewById(R.id.txtNombre)
        txtNota1 = findViewById(R.id.txtNota1)
        txtNota2 = findViewById(R.id.txtNota2)
        txtNota3 = findViewById(R.id.txtNota3)
        txtNota4 = findViewById(R.id.txtNota4)
        txtNota5 = findViewById(R.id.txtNota5)
        btnPromedio = findViewById(R.id.btnPromedio)
        txtPromedio = findViewById(R.id.txtPromedio)
        txtResultado = findViewById(R.id.txtResultado)

        btnPromedio.setOnClickListener(View.OnClickListener {

            val nombre = txtNombre.text.toString()
            val nota1 = txtNota1.text.toString().toDouble()
            val nota2 = txtNota2.text.toString().toDouble()
            val nota3 = txtNota3.text.toString().toDouble()
            val nota4 = txtNota4.text.toString().toDouble()
            val nota5 = txtNota5.text.toString().toDouble()

            val promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5
            txtPromedio.text = "El promedio de $nombre es $promedio"

            val resultado = if (promedio >= 6.0) "Aprobado" else "Reprobado"
            txtResultado.text = "El estudiante a $resultado"
        })
    }

}