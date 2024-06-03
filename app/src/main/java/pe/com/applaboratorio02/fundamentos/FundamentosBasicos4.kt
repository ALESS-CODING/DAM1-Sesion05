package pe.com.applaboratorio02.fundamentos

fun main(){
    //colecciones de solo lectura --> constante
    val listaanimal = listOf<String>("lobo","leon","tigre","perro","gato")
    //mostrar valores individuales
    println(listaanimal.get(0))
    println(listaanimal.get(3))
    //mostrando un indice
    println("El indice es: ${listaanimal.indexOf("tigre")}")
    //mostrando todos los valores
    for (animal in listaanimal){
        println("Animal: $animal")
    }
    var cont=0
    while (cont<listaanimal.size){
        println("Animal: "+listaanimal[cont])
        cont++
    }
}