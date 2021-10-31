package br.senac.android.lista1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.android.lista1.databinding.ActivityExercicio8Binding

class exercicio8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityExercicio8Binding

        super.onCreate(savedInstanceState)

        binding = ActivityExercicio8Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnOpen.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse(binding.urlInput.text.toString()))
            startActivity(i)
        }
    }
}