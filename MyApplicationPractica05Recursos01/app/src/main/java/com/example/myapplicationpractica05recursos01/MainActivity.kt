package com.example.myapplicationpractica05recursos01

import com.example.myapplicationpractica05recursos01.Alumno
import com.example.myapplicationpractica05recursos01.Empleado
import com.example.myapplicationpractica05recursos01.Calculadora
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater =menuInflater
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_muestra, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Se seleccionó la primer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Alumno::class.java)
            startActivity(intent)
        }

        if (id == R.id.opcion2) {
            Toast.makeText(this, "Se seleccionó la segunda opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Empleado::class.java)
            startActivity(intent)
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Se seleccionó la tercera opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }
}