package pe.com.applaboratorio02.fundamentos

fun main(){
    //Llamamos a la funcion MostrarSaludo de FundamentosBasicos
    MostrarSaludo("Jose")
    //Declaramos variables
    var num1=10.0
    var num2=5.0
    var sum= CalcularSuma(num1,num2)
    var res= CalcularResta(num1,num2)
    var mul= CalcularMultiplicacion(num1,num2)
    var div= CalcularDivision(num1,num2)
    println("La suma es: $sum")
    println("La resta es: $res")
    println("La multiplicacion es: $mul")
    println("La division es: $div")
    //Declaramos variables
    var nota1=18.71
    var nota2=15.47
    var nota3=19.4
    var nota4=16.77
    var promedio = CalcularPromedio(nota1,nota2,nota3,nota4)
    println("El promedio final es: $promedio")
    //Llamamos a la funcion para mostrar datos:
    MostrarDatos("Mario","Huappalla","41526398")
    MostrarDatos("Jose")
    MostrarDatos("Stefani","Morales")
    MostrarDatos(nombre = "Dilia", dni = "15968742")
} //fin del main

//Hacemos que la funcion sea privada para que no se pueda acceder desde otros archivos
//kotlin los procedimientos llevan el tipo Unit es equivalente a void
private fun MostrarBienvenida(){
    println("Bienvenido al curso de kotlin")
}
//Creamos una funcion para las operaciones basicas
fun CalcularSuma(n1:Double,n2:Double):Double{
    return n1+n2
}
fun CalcularResta(n1:Double,n2:Double):Double{
    return n1-n2
}
fun CalcularMultiplicacion(n1:Double,n2:Double):Double{
    return n1*n2
}
fun CalcularDivision(n1:Double,n2:Double):Double{
    return n1/n2
}
fun CalcularPromedio(nt1:Double,nt2:Double,nt3:Double,nt4:Double)=(nt1+nt2+nt3+nt4)/4

fun MostrarDatos(nombre:String,apellido:String="",dni:String=""){
    println("El nombre es: $nombre")
    println("El apellido es: $apellido")
    println("El dni es: $dni")
}
