package pe.com.applaboratorio02.clases

import android.content.Context
import android.widget.Toast

class Utilidad {

    //Creacmos una funcion para  mostrar mensajes

    fun MensajeToast(context: Context?, mensaje:String = ""){
        Toast.makeText(context, mensaje, Toast.LENGTH_LONG ).show()
    }

}
