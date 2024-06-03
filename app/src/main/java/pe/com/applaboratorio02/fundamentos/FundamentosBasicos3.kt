package pe.com.applaboratorio02.fundamentos

fun main(){
    MostrarProducto("Laptop Lenovo I7",2000.0,15)
    MostrarProductoVarios("Laptop Lenovo I7","2000.0","15")
    MostrarProductoVarios2("Laptop Lenovo I7","2000.0","15")
    MostrarEstaciones("Verano","Otoño","Invierno","Primavera")
    MostrarEstaciones2("Verano","Otoño","Invierno","Primavera")
    MostrarEstaciones3("Verano","Otoño","Invierno","Primavera")
    MostrarEstaciones4("Verano","Otoño","Invierno","Primavera")
    MostrarEstaciones5("Verano","Otoño","Invierno","Primavera")
}

//creamos una funcion para mostrar productos
fun MostrarProducto(nombre:String,precio:Double,cantidad:Int){
    println("Nombre: $nombre")
    println("Precio: $precio")
    println("Cantidad: $cantidad")
}

fun MostrarProductoVarios(vararg productos:String){
    for (producto in productos){
        println("Datos: $producto")
    }
}

fun MostrarProductoVarios2(vararg productos:String){
    var cont=0
    while (cont<productos.size){
        println("Datos2: "+productos[cont])
        cont++
    }
}

fun MostrarEstaciones(vararg estaciones:String){
    var cont=0
    while (cont<estaciones.size){
        if(estaciones[cont]=="Verano")
            println("Es verano, clima perfecto")
        println("Estaciones: "+estaciones[cont])
        cont++
    }
}

fun MostrarEstaciones2(vararg estaciones:String){
    var cont=0
    while (cont<estaciones.size){
        if(estaciones[cont]=="Verano") {
            println("Es verano, clima perfecto")
        }
        println("Estaciones: "+estaciones[cont])
        cont++
    }
}

fun MostrarEstaciones3(vararg estaciones:String){
    var cont=0
    while (cont<estaciones.size){
        if(estaciones[cont]=="Verano") {
            println("Es verano, clima perfecto")
        }else{
            println("Estaciones: "+estaciones[cont])
        }
        cont++
    }
}

fun MostrarEstaciones4(vararg estaciones:String){
    var cont=0
    while (cont<estaciones.size){
        if(estaciones[cont]=="Verano") {
            println("Es verano, clima perfecto")
        }else if(estaciones[cont]=="Otoño"){
            println("Es Otoño, clima nostalgico")
        }else if(estaciones[cont]=="Invierno"){
            println("Es Invierno, clima frio")
        }else if(estaciones[cont]=="Primavera") {
            println("Es Primavera, clima alegre")
        }else{
            println("No es una estación válida")
        }
        cont++
    }
}

fun MostrarEstaciones5(vararg estaciones:String){
    var cont=0
    while (cont<estaciones.size){
        when(estaciones[cont]){
            "Verano"-> println("Es verano, clima perfecto")
            "Otoño"-> println("Es otoño, clima nostalgico")
            "Invierno"->{
                println("Es invierno, clima frio")
                println("Mal clima")
            }
            "Primavera"-> println("Es primavera, clima alegre")
            else-> println("No es una estación válida")
        }
        cont++
    }
}