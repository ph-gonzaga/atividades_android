package br.senac.android.lista2.ex1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.FragmentClientesBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout


class ClientesFragment : Fragment() {

    lateinit var binding: FragmentClientesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentClientesBinding.inflate(inflater)

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

        if (binding.editTextNomeCliente.text.toString().isEmpty()) {
            binding.editTextNomeCliente.error = "campo é obrigatório"
            error = true
        }
        if (binding.editTextGenero.text.toString().isEmpty()) {
            binding.editTextGenero.error = "campo é obrigatório"
            error = true
        }
        if (binding.editTextDataNascimento.text.toString().isEmpty()) {
            binding.editTextDataNascimento.error = "campo é obrigatório"
            error = true
        }
        if (binding.editTextEstadoCivil.text.toString().isEmpty()) {
            binding.editTextEstadoCivil.error = "campo é obrigatório"
            error = true
        }

        return error
    }

    companion object {
        @JvmStatic
        fun newInstance() = ClientesFragment()
    }
}