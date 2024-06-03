package pe.com.applaboratorio02.fundamentos

//Para que el kotlin ejecute a nivel de consola es necesario
//agregar una funcion que sea main()-->Principal
//las funciones en kotlin se agregan con la palabra fun
fun main(){
    println("Curso de Aplicaciones Moviles I")
    println("Mario Huapalla")

    val nombre = "Antonio"
    val edad = 20
    val promedio = 19.8
    val estado = false

    println("El nombre es: $nombre")
    println("La edad es: $edad")
    println("El promedio es: $promedio")
    println("El estado es: $estado")

    var precio = 1000
    var igv = precio*0.18
    var preciofinal = precio+igv
    println("El precio es: $precio")
    println("El igv es: $igv")
    println("El precio final es: $preciofinal")

    preciofinal = preciofinal+50
    println("El precio final mas delivery es: $preciofinal")

    var curso:String
    var creditos:Int
    var costo:Double
    var condicion:Boolean
    //asignando valores
    curso="Aplicaciones Moviles"
    creditos=4
    costo=255.55
    condicion=true
    println("El curso es: $curso")
    println("El número de creditos es: $creditos")
    println("El costo es: $costo")
    println("La condición es: $condicion")

    //variable nulo --> se le asigna el signo de ?
    var valornulo:String?
    valornulo=null
    println(valornulo)
    //variable de cualquier tipo
    var valoraleatorio:Any?
    valoraleatorio=false
    println(valoraleatorio)
    valoraleatorio=19.8
    println(valoraleatorio)
    valoraleatorio=null
    println(valoraleatorio)

    //Llamamos a la funcion:
    MostrarSaludo("Jose")
} //final del main

//Creamos una funcion que reciba un argumento de tipo String
//Esta funcion recibira un nombre y mostrara un saludo
fun MostrarSaludo(nombre:String){
    println("Hola como estas "+nombre)
}