package br.senac.android.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercicio5.*

class exercicio5 : AppCompatActivity() {

    private var firstOperator = 0.0
    private var secondOperation = 0.0
    private var operation = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio5)

        resultadoText.text = "0"

        operation = NO_OPERATION

        umBtn.setOnClickListener { pressNum("1") }
        doisBtn.setOnClickListener { pressNum("2") }
        tresBtn.setOnClickListener { pressNum("3") }
        quatroBtn.setOnClickListener { pressNum("4") }
        cincoBtn.setOnClickListener { pressNum("5") }
        seisBtn.setOnClickListener { pressNum("6") }
        seteBtn.setOnClickListener { pressNum("7") }
        oitoBtn.setOnClickListener { pressNum("8") }
        noveBtn.setOnClickListener { pressNum("9") }
        zeroBtn.setOnClickListener { pressNum("0") }
        pontoBtn.setOnClickListener { pressNum(".") }

        limparBtn.setOnClickListener { resetAll() }

        somarBtn.setOnClickListener { pressOp(SUM) }
        menosBtn.setOnClickListener { pressOp(SUB) }
        multiplicacaoBtn.setOnClickListener { pressOp(MULTIPLICATION) }
        divisaoBtn.setOnClickListener { pressOp(DIVISION) }

        igualBtn.setOnClickListener { resolvePressed() }
    }

    private fun pressNum(num: String){
        if(resultadoText.text == "0" && num != ".") {
            resultadoText.text = "$num"
        } else {
            resultadoText.text = "${resultadoText.text}$num"
        }

        if(operation == NO_OPERATION){
            firstOperator = resultadoText.text.toString().toDouble()
        } else {
            secondOperation = resultadoText.text.toString().toDouble()
        }
    }

    private fun pressOp(operation: Int){
        this.operation = operation
        firstOperator = resultadoText.text.toString().toDouble()

        resultadoText.text = "0"
    }

    private fun resolvePressed(){

        val result = when(operation) {
            SUM -> firstOperator + secondOperation
            SUB -> firstOperator - secondOperation
            MULTIPLICATION -> firstOperator * secondOperation
            DIVISION -> firstOperator / secondOperation
            else -> 0
        }

        firstOperator = result as Double

        resultadoText.text = if("$result".endsWith(".0")) { "$result".replace(".0","") } else { "%.2f".format(result) }
    }

    private fun resetAll(){
        resultadoText.text = "0"
        firstOperator = 0.0
        secondOperation = 0.0
    }

    companion object {
        const val SUM = 1
        const val SUB = 2
        const val MULTIPLICATION = 3
        const val DIVISION = 4
        const val NO_OPERATION = 0
    }

}