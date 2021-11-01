package br.senac.android.lista2.ex5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.ActivityBottomNavBinding
import br.senac.android.lista2.ex2.CelsiusFragment
import br.senac.android.lista2.ex2.FahrenheitFragment
import br.senac.android.lista2.ex2.KevinFragment

class BottomNavActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val celsius = CelsiusFragment()
        val fahrenheit = FahrenheitFragment()
        val kevin = KevinFragment()

        replaceFragment(celsius)

        binding.bottomNav.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.menuCtoF -> replaceFragment(celsius)
                R.id.menuFtoK -> replaceFragment(fahrenheit)
                R.id.menuKtoC -> replaceFragment(kevin)
                else -> "Invalid "
            }

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