package pe.com.applaboratorio02.fundamentos.clases

data class Empleado (val codigo:Long = 0, val nombre:String = "",
    val apellido: String = "", val direccion:String = "",
    val usuario: String = "", val clave : String = "",
    val rol : Int = 0) {

    fun mostrarInformacionEmpleado (){
        println("El codigo es: $codigo")
        println("El nombre es: $nombre")
        println("El apellido es: $apellido")
        println("El direccion es: $direccion")
        println("El usuario es: $usuario")
        println("El clave es: $clave")
        println("El rol es: $rol")
    }
}