package br.senac.android.lista2.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.ActivityMainEx1Binding

class MainEX1Activity : AppCompatActivity() {

    lateinit var binding: ActivityMainEx1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainEx1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val formClientes = ClientesFragment()
        val formProduto = ProdutoFragment()


        binding.btnFormClientes.setOnClickListener {

                replaceFragment(formClientes)

            true

        }

        binding.btnFormProdutos.setOnClickListener {

            replaceFragment(formProduto)

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