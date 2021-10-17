package br.senac.android.lista1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.android.lista1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnEx1.setOnClickListener {
            val intent = Intent(this, exercicio1::class.java)
            startActivity(intent)
        }

        binding.btnEx2.setOnClickListener {
            val intent = Intent(this, exercicio2::class.java)
            startActivity(intent)
        }
        binding.btnEx3.setOnClickListener {
            val intent = Intent(this, exercicio3::class.java)
            startActivity(intent)
        }
    }
}