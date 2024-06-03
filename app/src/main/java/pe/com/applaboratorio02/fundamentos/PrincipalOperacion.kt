package pe.com.applaboratorio02.fundamentos

import pe.com.applaboratorio02.fundamentos.clases.Operacion

fun main() {
    val objOperacion: Operacion = Operacion ()

    //asignamios los valores
    objOperacion.numero1 = 10.0
    objOperacion.numero2 = 5.0

    //Operaciones
    var sum = objOperacion.CalcularSuma()
    var res = objOperacion.CalcularResta()
    var mul = objOperacion.CalcularMultiplicacion()
    var div = objOperacion.CalcularDivision()

    //eviamos los datos
    objOperacion.suma = sum
    objOperacion.resta = res
    objOperacion.multiplicacion = mul
    objOperacion.division = div

    //Mostrar los resultados
    objOperacion.MostrarResultados()

}