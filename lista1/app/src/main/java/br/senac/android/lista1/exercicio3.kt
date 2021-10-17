package br.senac.android.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_exercicio3.*
import android.widget.EditText

class exercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio3)

        carregaSpinner()

    }

    fun carregaSpinner(){
        val tipoEmail = arrayOf("Selecione", "Pessoal", "Profissional", "Outros")
        val tipoAppMensage = arrayOf("Selecione", "WhatsApp", "Telegram", "Signal", "Discord", "Teams")

        val adapterSpinner1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipoEmail)
        adapterSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinTipoEmail.adapter = adapterSpinner1

        val adapterSpinner2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipoAppMensage)
        adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinTipoAppMensage.adapter = adapterSpinner2
    }
}