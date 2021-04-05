package com.pestana.meuimc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val resInfo = arrayOf(
        "Magreza Grave: Procure um médico imediatamente e siga todas as orientções a risca!",
        "Magreza Moderada: Cuidado! Evite lugares com ventos fortes, pois correrá o risco de ser levado pela natureza.",
        "Magreza Leve: Que isso! Não precisava tanto! Nada que uma boa alimentação seguida por orientações de profissionais competentes que não resolva essa pequena falta de massa corporal.",
        "Saudável: PARABÉNS! Vocês está na sua melhor forma!",
        "Sobrepeso: Está com uns 'pneuzinhos' né? Mas se focar consegue chegar a 18,5 de IMC em um 'piscar de olhos'.",
        "Obesidade Grau I: Tá na hora de dar uma pausa nesses 'Fast-food' que você adora. Pois se continuar assim não vai conseguir nem mais amarrar o cadarço do sapato.",
        "Obesidade Grau II (considerada severa): Seria uma boa idéia prestar mais atenção na sua saúde! Separa um tempo bacana, se excercite mais e tenha uma boa alimentação. Tudo isso é claro, acompanhado de orientação de profissionais competentes.",
        "Obesidade Grau III (considerada mórbida): Levanta daí agora! Procure um médico imediatamente e siga todas as orientções a risca."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            setListeners( )
    }

    private fun setListeners() {
        buttonCalculate.setOnClickListener {
            imcCalculator (editTextNumberWeight.text.toString(), editTextNumberHeight.text.toString())
        }
    }

    private fun imcCalculator (weight: String, height: String){
    val weight = weight.toFloatOrNull()
    val height = height.toFloatOrNull()

        if (weight != null && height != null) {
            val imc = weight / (height * height)
            textResult.text = "O seu IMC é de $imc"
            if (imc<16) {textInfoResult.text = resInfo[0]}
            else if (imc>=16 && imc<17) {textInfoResult.text = resInfo[1]}
            else if (imc>=17 && imc<18.5) {textInfoResult.text = resInfo[2]}
            else if (imc>=18.5 && imc<25) {textInfoResult.text = resInfo[3]}
            else if (imc>=25 && imc<30) {textInfoResult.text = resInfo[4]}
            else if (imc>=30 && imc<35) {textInfoResult.text = resInfo[5]}
            else if (imc>=35 && imc<40) {textInfoResult.text = resInfo[6]}
            else if (imc>=40) {textInfoResult.text = resInfo[7]}
        }
    }
}