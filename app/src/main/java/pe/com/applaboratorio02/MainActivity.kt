package pe.com.applaboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import pe.com.applaboratorio02.clases.Utilidad

class MainActivity : AppCompatActivity() {

    //declarando variables
    private lateinit var txtNumero1:EditText
    private lateinit var txtNumero2:EditText
    private lateinit var txtSuma:EditText
    private lateinit var txtMultiplicacion:EditText
    private lateinit var txtDivision:EditText

    private lateinit var btnCalcular: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnSalir: Button

    // creamos un objeto de la clase utilidad
    val objUtlidad:Utilidad = Utilidad()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaramos variables
        txtNumero1 = findViewById(R.id.txtNota2)
        txtNumero2 = findViewById(R.id.txtNota2)
        txtSuma = findViewById(R.id.txtNota3)
        txtMultiplicacion = findViewById(R.id.txtPromedio)
        txtDivision = findViewById(R.id.txtCondicion)

        btnCalcular = findViewById(R.id.btnCalcular2)
        btnLimpiar = findViewById(R.id.btnLimpiar2)
        btnSalir = findViewById(R.id.btnSalir2)

        var num1=0.0
        var num2=0.0
        var sum=0.0
        var res=0.0
        var mul=0.0
        var div=0.0

        //buttnCalcular
        btnCalcular.setOnClickListener(View.OnClickListener {
            //validando datos
            if(txtNumero1.getText().toString().equals("")){
                objUtlidad.MensajeToast(this,"Ingrese el numero 1")
                txtNumero1.requestFocus()
            }else if(txtNumero2.getText().toString().equals("")){
                objUtlidad.MensajeToast(this,"Ingrese el numero 2")
                txtNumero2.requestFocus()
            }
            else{
                //capturando datos
                num1 = txtNumero1.getText().toString().toDouble()
                num2 = txtNumero2.getText().toString().toDouble()

                //Realizamos operaciones
                sum = CalcularSuma(num1, num2)
                mul = CalcularMultiplicacion(num1 , num2)
                res = CalcularResta(num1, num2)
                div = CalcularDivision(num1, num2)
            }


        })

        btnLimpiar.setOnClickListener(View.OnClickListener {
            txtSuma.setText("")
            txtDivision.setText("")
            txtMultiplicacion.setText("")
            txtNumero1.setText("")
            txtNumero2.setText("")
            txtNumero1.requestFocus()

        } )

        btnSalir.setOnClickListener (View.OnClickListener {
            finish()
        })


    }


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


}