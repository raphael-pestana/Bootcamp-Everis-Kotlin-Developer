package com.pestana.calculadora

import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        //Numbers
        number_0.setOnClickListener {AddAnExpression ("0", true)}
        number_1.setOnClickListener {AddAnExpression ("1", true)}
        number_2.setOnClickListener {AddAnExpression ("2", true)}
        number_3.setOnClickListener {AddAnExpression ("3", true)}
        number_4.setOnClickListener {AddAnExpression ("4", true)}
        number_5.setOnClickListener {AddAnExpression ("5", true)}
        number_6.setOnClickListener {AddAnExpression ("6", true)}
        number_7.setOnClickListener {AddAnExpression ("7", true)}
        number_8.setOnClickListener {AddAnExpression ("8", true)}
        number_9.setOnClickListener {AddAnExpression ("9", true)}
        dot.setOnClickListener {AddAnExpression(".", true)}

        //Operations
        division.setOnClickListener {AddAnExpression("/", false)}
        multiplication.setOnClickListener {AddAnExpression("*", false)}
        decrease.setOnClickListener {AddAnExpression("-", false)}
        sum.setOnClickListener {AddAnExpression("+", false)}

        clear.setOnClickListener {
            expression.text = ""
            result.text = ""
        }

        backspace.setOnClickListener{
            val string = expression.text.toString()

            if (string.isNotBlank()){
                expression.text = string.substring(0, string.length-1)
            }
            result.text =""
        }

        equals.setOnClickListener {
            try {
                val express = ExpressionBuilder (expression.text.toString()).build()
                val res = express.evaluate()
                val longRes = res.toLong()

                if(res == longRes.toDouble()) {
                    result.text = longRes.toString()
                }else{
                    result.text = res.toString()
                }

            }catch (e: Exception){

            }
        }
    }

    fun AddAnExpression(string: String, clear_data: Boolean){
        if (result.text.isNotEmpty()){
            expression.text = ""
        }
        if (clear_data) {
            result.text = ""
            expression.append(string)
        }else{
            expression.append(result.text)
            expression.append(string)
            result.text = ""

        }
    }
}