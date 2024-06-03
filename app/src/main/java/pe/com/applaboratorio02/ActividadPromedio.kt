package pe.com.applaboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import pe.com.applaboratorio02.clases.Utilidad

class ActividadPromedio : AppCompatActivity() {
    //declarando variables
/*
    private lateinit var txtNota1: EditText
    private lateinit var txtNota2: EditText
    private lateinit var txtNota3: EditText
    private lateinit var txtNota4: EditText
    private lateinit var txtCodicion: EditText
    private lateinit var txtPromedio: EditText

    private lateinit var btnCalcular: Button
    private lateinit var btnLimpiar: Button
    private lateinit var btnSalir: Button

    var n1:Double = 0.0
    var n2:Double = 0.0
    var n3:Double = 0.0
    var n4:Double = 0.0
    var prom:Double = 0.0
    var condi:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_promedio)

        val objUtilidad = Utilidad()

        txtNota1 = findViewById(R.id.txtNumero2)
        txtNota2 = findViewById(R.id.txtNumero2)
        txtNota3 = findViewById(R.id.txtSuma)
        txtNota4 = findViewById(R.id.txtResta)

        btnCalcular = findViewById(R.id.calcular)
       // btnLimpiar = findViewById(R.id.btnLimpiar)
       // btnSalir = findViewById(R.id.btnSalir)

        btnCalcular.setOnClickListener(View.OnClickListener {
            if(txtNota1.getText().toString().equals("")){
                objUtilidad.MensajeToast(this, "Ingrese la nota 1")
                txtNota1.requestFocus()
            }else if(txtNota2.getText().toString().equals("")){
                objUtilidad.MensajeToast(this, "Ingrese la nota 2")
                txtNota2.requestFocus()
            }else if(txtNota3.getText().toString().equals("")){
                objUtilidad.MensajeToast(this, "Ingrese la nota 3")
                txtNota3.requestFocus()
            }else if(txtNota4.getText().toString().equals("")){
                objUtilidad.MensajeToast(this, "Ingrese la nota 4")
                txtNota4.requestFocus()
            }
            else {
                n1 = txtNota1.getText().toString().toDouble()
                n2 = txtNota2.getText().toString().toDouble()
                n3 = txtNota3.getText().toString().toDouble()
                n4 = txtNota2.getText().toString().toDouble()

                prom = CalcularPromedio(n1, n2,n3,n4)

                if(prom > 13){
                    txtPromedio.setText("El promedio es: $prom")
                    txtCodicion.setText("Aprobado")
                }else{
                    txtPromedio.setText("El promedio es: $prom")
                    txtCodicion.setText("Reprobado")
                }
            }


        })
    }




    fun CalcularPromedio(nt1:Double,nt2:Double,nt3:Double,nt4:Double)=(nt1+nt2+nt3+nt4)/4

 */
}