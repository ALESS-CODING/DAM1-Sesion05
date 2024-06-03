package pe.com.applaboratorio02.fundamentos

import pe.com.applaboratorio02.fundamentos.clases.Empleado
import pe.com.applaboratorio02.fundamentos.clases.Rol

fun main() {
    val objEmpleado = Empleado(1, "ALESS", "SEDANO", "LIMA", "aless", "123", Rol.ADIMINISTRADOR.ordinal)

    objEmpleado.mostrarInformacionEmpleado()
    println(objEmpleado.component2())
    println(objEmpleado)


}