package br.senac.android.lista2.ex2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.senac.android.lista2.R
import br.senac.android.lista2.databinding.FragmentFahrenheitBinding
import br.senac.android.lista2.databinding.FragmentKevinBinding

class KevinFragment : Fragment() {

    lateinit var binding: FragmentKevinBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentKevinBinding.inflate(inflater)

        binding.btnConverterKC.setOnClickListener {


            var valorKevinDigitado = binding.editTextKevin2.text.toString()
            var result = 0 + ((valorKevinDigitado.toDouble() - 273.15))

            binding.editTextCelsius2.setText(result.toString())

        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = KevinFragment()
    }
}