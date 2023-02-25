class Empleado(val nombre: String, val salarioBase: Double) {
    fun CalcularSalarioNeto(): Double {

        val descuentos = salarioBase * 0.12
        val SalarioNeto = salarioBase - descuentos

        return SalarioNeto
    }
}