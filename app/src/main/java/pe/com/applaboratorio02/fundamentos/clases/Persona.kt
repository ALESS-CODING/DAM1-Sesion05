package pe.com.applaboratorio02.fundamentos.clases

//Para que puedas heredar debes de agregar la palabra open
open class Persona (val nombre:String = "", val apellido:String = "") {

    open fun mostrarInformacion (){
        println("El nombre es: $nombre")
        println("El apellido es: $apellido")
    }

}