package pe.com.applaboratorio02.fundamentos.clases

class Operacion {

    var numero1:Double = 0.0
    var numero2:Double = 0.0
    var suma:Double = 0.0
    var resta:Double = 0.0
    var multiplicacion:Double = 0.0
    var division:Double = 0.0

    //Creamos una funcion para las operaciones basicas

    fun CalcularSuma():Double{
        return numero1+numero2
    }
    fun CalcularResta():Double{
        return numero1-numero2
    }
    fun CalcularMultiplicacion():Double{
        return numero1*numero2
    }
    fun CalcularDivision():Double{
        return numero1/numero2
    }

    fun MostrarResultados (){
        println("La suma es: $suma")
        println("La resta es: $resta")
        println("La multiplicacion es: $multiplicacion")
        println("La division es: $division")
    }
}