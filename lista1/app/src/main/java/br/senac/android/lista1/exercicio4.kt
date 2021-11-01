package br.senac.android.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_exercicio4.*

class exercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio4)

        carregaSpinnerCategoria()
    }

    fun carregaSpinnerCategoria(){
        var tipoCategoria = arrayOf("Selecione", "Filme", "Música", "Livro", "Jogo")

        var adapterSpinner1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipoCategoria)
        adapterSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinCategoria.adapter = adapterSpinner1

        spinCategoria.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long){
                var generoSelect = tipoCategoria.get(id.toInt());
                carregaSpinnerGenero(generoSelect)
             }
            override fun onNothingSelected(parent: AdapterView<*>){
            }
        }
    }

    fun carregaSpinnerGenero(genero: String){
        var listaGenero = arrayOf("")
        when (genero) {
            "Selecione" -> Toast.makeText(applicationContext, "Selecione uma categoria", Toast.LENGTH_SHORT).show()
            "Filme" -> listaGenero = arrayOf("Selecione", "Aventura", "Romance", "Suspense", "Terror")
            "Música" -> listaGenero = arrayOf("Selecione", "MPB", "POP", "JAZZ", "FUNK")
            "Livro" -> listaGenero = arrayOf("Selecione", "Conto", "Cronica", "Biográfico", "Memórias")
            "Jogo" -> listaGenero = arrayOf("Selecione", "RPG", "Puzzle", "Estratégia", "Simulacao")
            else -> {
                Toast.makeText(applicationContext, "Categoria inválida", Toast.LENGTH_SHORT).show()
            }
        }
        val adapterSpinner2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaGenero)
        adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinGenero.adapter = adapterSpinner2
    }
}