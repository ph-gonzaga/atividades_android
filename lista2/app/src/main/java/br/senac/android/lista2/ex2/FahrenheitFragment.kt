package br.senac.android.lista2.ex2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.FragmentCelsiusBinding
import br.senac.android.lista2.databinding.FragmentFahrenheitBinding
import br.senac.android.lista2.ex1.ClientesFragment


class FahrenheitFragment : Fragment() {

    lateinit var binding: FragmentFahrenheitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFahrenheitBinding.inflate(inflater)

        binding.btnConverterFK.setOnClickListener {


            var valorFahrenheitDigitado = binding.editTextFahrenheit2.text.toString()
            var result = 273.5 + ((valorFahrenheitDigitado.toDouble() - 32.0) * (5.0/9.0))

            binding.editTextKevin.setText(result.toString())

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = FahrenheitFragment()
    }
}