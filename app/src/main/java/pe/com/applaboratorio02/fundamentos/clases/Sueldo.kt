package pe.com.applaboratorio02.fundamentos.clases

class Sueldo (val numeroHoras:Double = 0.0, val costoHora:Double = 0.0) {

    fun calcularSueldoBasico():Double = numeroHoras * costoHora
    fun calcularBonificacion():Double = calcularSueldoBasico() * 0.08
    fun calcularDescuento():Double = calcularSueldoBasico() * 0.03
    fun calcularSueldoFinal():Double = calcularSueldoBasico() + calcularBonificacion() - calcularDescuento()

    fun mostrarPagos(){
        println("Los datos son:")
        println("El sueldo basico es: ${calcularSueldoBasico()}")
        println("El bonificacion es: ${calcularBonificacion()}")
        println("El descuento es: ${calcularDescuento()}")
        println("El sueldo final es: ${calcularSueldoFinal()}")
    }


}