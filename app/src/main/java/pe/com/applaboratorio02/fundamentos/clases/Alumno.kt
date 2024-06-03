package pe.com.applaboratorio02.fundamentos.clases

class Alumno (nombre:String = "", apellido:String = "", val curso:String = ""): Persona(nombre, apellido){

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("El curso es: $curso")
    }
}