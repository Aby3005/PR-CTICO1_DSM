package com.example.promedioestudiante

import Alumno
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        btnPromedio.setOnClickListener{

            val nombre = txtNombre.text.toString()
            val notas = arrayOf(
                    txtNota1.text.toString().toFloat(),
                    txtNota2.text.toString().toFloat(),
                    txtNota3.text.toString().toFloat(),
                    txtNota4.text.toString().toFloat(),
                    txtNota5.text.toString().toFloat()
            )

            val alumno = Alumno(nombre, notas)
            val promedio = alumno.CalcularPromedio()
            val resultado = alumno.Resultado()

            txtPromedio.text = "El promedio de $nombre es $promedio"
            txtResultado.text = "El estudiante ha $resultado"
        }
    }

}