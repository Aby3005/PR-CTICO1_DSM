package com.example.myapplicationpractica05recursos01


class Calculadoras (val valor1: Double, val valor2: Double) {

    fun Suma(): Double {
        val suma=valor1+valor2
        return suma
    }

    fun subtract(): Double {
        val resta=valor1-valor2
        return resta
    }

    fun multiply(): Double {
        return valor1*valor2
    }

    fun divide(): Double {
        return valor1/valor2
    }
}