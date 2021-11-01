package br.senac.android.lista2.ex2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.FragmentCelsiusBinding
import br.senac.android.lista2.databinding.FragmentClientesBinding
import br.senac.android.lista2.ex1.ClientesFragment
import com.google.android.material.snackbar.Snackbar


class CelsiusFragment : Fragment() {

    lateinit var binding: FragmentCelsiusBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentCelsiusBinding.inflate(inflater)

        binding.btnConverterCF.setOnClickListener {


            var valorCelsiusDigitado = binding.editTextCelsius.text.toString()
            var result = (9/5.0 * valorCelsiusDigitado.toDouble()) + 32

            binding.editTextFahrenheit.setText(result.toString())

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = ClientesFragment()
    }
}