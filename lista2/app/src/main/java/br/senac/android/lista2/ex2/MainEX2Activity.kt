package br.senac.android.lista2.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.ActivityMainEx2Binding
import br.senac.android.lista2.ex1.ClientesFragment
import br.senac.android.lista2.ex1.ProdutoFragment

class MainEX2Activity : AppCompatActivity() {

    lateinit var binding: ActivityMainEx2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainEx2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val celsius = CelsiusFragment()
        val fahrenheit = FahrenheitFragment()
        val kevin = KevinFragment()



        binding.btnCelsius.setOnClickListener {

            replaceFragment(celsius)

            true

        }

        binding.btnFahrenheit.setOnClickListener {

            replaceFragment(fahrenheit)

            true

        }

        binding.btnKevin.setOnClickListener {

            replaceFragment(kevin)

            true

        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment).commit()
        }
    }
}