package br.senac.android.lista2.ex1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.FragmentClientesBinding
import br.senac.android.lista2.databinding.FragmentProdutoBinding
import com.google.android.material.snackbar.Snackbar

class ProdutoFragment : Fragment() {

    lateinit var binding: FragmentProdutoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentProdutoBinding.inflate(inflater)

        binding.fab.setOnClickListener { view ->

            if(validaFormulario() == true){
                validaFormulario()
            }else{
                Snackbar.make(view, "Os dados foram salvos", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
            }

        }

        return binding.root
    }

    private fun validaFormulario(): Boolean {

        var error = false

        if (binding.editTextNomeProduto.text.toString().isEmpty()) {
            binding.editTextNomeProduto.error = "campo é obrigatório"
            error = true
        }
        if (binding.editTextTipo.text.toString().isEmpty()) {
            binding.editTextTipo.error = "campo é obrigatório"
            error = true
        }
        if (binding.editTextMarca.text.toString().isEmpty()) {
            binding.editTextMarca.error = "campo é obrigatório"
            error = true
        }

        return error
    }

    companion object {
        @JvmStatic
        fun newInstance() = ClientesFragment()
    }
}