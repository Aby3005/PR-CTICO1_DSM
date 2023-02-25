class Alumno(val nombre: String, val notas: Array<Float>) {
    fun CalcularPromedio(): Float {
        var SumaNotas = 0f
        for (nota in notas) {
            SumaNotas += nota
        }
        return SumaNotas / notas.size
        }

    fun Resultado(): String {
        return if (CalcularPromedio() >= 6) {
            "aprobado"
        } else {
            "reprobado"
        }
    }
}