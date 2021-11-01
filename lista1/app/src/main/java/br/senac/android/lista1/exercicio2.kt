package br.senac.android.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText

class exercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio2)

        var nome = findViewById<EditText>(R.id.fieldNome)
        var telefone = findViewById<EditText>(R.id.fieldTelefone)
        var email = findViewById<EditText>(R.id.fieldEmail)
        var whatsapp = findViewById<EditText>(R.id.fieldApp)

        var checkTele = findViewById<CheckBox>(R.id.checkTelefone)
        var checkMail = findViewById<CheckBox>(R.id.checkEmail)
        var checkApp = findViewById<CheckBox>(R.id.checkApp)

        var btnValidar = findViewById<Button>(R.id.btnSalvar)


        checkTele.setOnCheckedChangeListener { button: CompoundButton, checked: Boolean ->

            if (checkTele.isChecked) {
                if (telefone.text.isNotBlank()) {
                    telefone.setEnabled(false);
                } else {
                    telefone.error = "O campo telefone esta vazio!"
                    telefone.setEnabled(true);
                }
                checkTele.setEnabled(true);
            } else {
                telefone.setEnabled(true);
            }
        }

        checkMail.setOnCheckedChangeListener { button: CompoundButton, checked: Boolean ->

            if (checkMail.isChecked) {
                if (email.text.isNotBlank()) {
                    email.setEnabled(false);
                } else {
                    email.error = "O campo E-amail esta vazio!"
                    email.setEnabled(true);
                }
            } else {
                email.setEnabled(true);
            }
        }

        checkApp.setOnCheckedChangeListener { button: CompoundButton, checked: Boolean ->

            if (checkApp.isChecked){
                if (whatsapp.text.isNotBlank()){
                    whatsapp.setEnabled(false);
                } else {
                    whatsapp.error = "O campo Whatsapp esta vazio!"
                    whatsapp.setEnabled(true);
                }
            }else{
                whatsapp.setEnabled(true);
            }
        }

        btnValidar.setOnClickListener {

            var msg = """ Nome: ${nome.text}
                | Telefone: ${telefone.text}
                | E-mail: ${email.text}
                | Whatsapp: ${whatsapp.text}
                | 
                |Preferencia de contato
                """.trimMargin()

            if (checkTele.isChecked){
                msg += "\n - Telefone"
            }

            if (checkMail.isChecked){
                msg += "\n - Email"
            }

            if (checkApp.isChecked){
                msg += "\n - Whatsapp"
            }

            alert("Informacoes inseridas com sucesso!", msg,this)
        }
    }
}