package com.example.androidcalculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
//import net.objecthunter.exp4j.ExpressionBuilder
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operation.text=" "
        var calc=Calculation()
        btn_0.setOnClickListener{calc.str=calc.number[0]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res
            }
        btn_1.setOnClickListener{ calc.str=calc.number[1]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_2.setOnClickListener{ calc.str=calc.number[2]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_3.setOnClickListener{calc.str=calc.number[3]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_4.setOnClickListener{calc.str=calc.number[4]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_5.setOnClickListener{calc.str=calc.number[5]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_6.setOnClickListener{calc.str=calc.number[6]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_7.setOnClickListener{calc.str=calc.number[7]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_8.setOnClickListener{calc.str=calc.number[8]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_9.setOnClickListener{calc.str=calc.number[9]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_comma.setOnClickListener{calc.str=calc.operations[0]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_add.setOnClickListener{calc.str=calc.operations[1]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_subtract.setOnClickListener{calc.str=calc.operations[2]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_multiply.setOnClickListener{calc.str=calc.operations[3]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_divide.setOnClickListener{calc.str=calc.operations[4]
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText()
            result.text=calc.res}
        btn_sqrt.setOnClickListener{calc.str=operation.text.toString()
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText1()
            result.text=calc.res
        }
        btn_revers.setOnClickListener{ calc.str=operation.text.toString()
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            operation.text=calc.writeText2()
            result.text=calc.res}
        //очистить все
        btn_clearall.setOnClickListener {
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            calc.clearall()
            operation.text=calc.main
            result.text=calc.res
        }
        //удалить последний элемент
        btn_clear.setOnClickListener{
            calc.main=operation.text.toString()
            calc.clear()
            operation.text=calc.main
            result.text=calc.res
        }
        //получить результат
        btn_equals.setOnClickListener {
            calc.main=operation.text.toString()
            calc.res=result.text.toString()
            result.text=calc.equals()
            /*try {
                val ex = ExpressionBuilder(operation.text.toString()).build()
                //нахождение результата
                val res = ex.evaluate()
                //округление в зависимости от результата
                val longRes = res.toLong()
                if(res == longRes.toDouble())

                    result.text = longRes.toString()
                else {
                    val context = MathContext(5, RoundingMode.HALF_UP)
                    val x = BigDecimal(res, context)
                    result.text = x.toString()
                }
            } catch (e: Exception) {
                Log.d("Ошибка", "${e.message}")
            }*/
        }

    }
    //функция заполнения строки для операций + - * /
    /*fun writeTextField(str: String){
        if(result.text != ""){
            operation.text = result.text
            result.text = ""
        }
        operation.append(str)
    }*/
    //функция заполнения строки для операции корень
    /*fun writeTextField1(str: String){
        if(result.text != ""){
            operation.text = " "
            val str = result.text.toString()
            result.text = ""
            operation.append(" sqrt(${str})")
        }
        else {
            val last = str.substringAfterLast(' ')
            val str = str.removeSuffix(last)
            operation.text = " "
            operation.append(str + " sqrt(${last})")
        }
    }*/
    //функция заполнения строки для операции изменение знака
    /*fun writeTextField2(str: String){
        if(result.text != ""){
            operation.text = result.text
            result.text = ""
        }
        val last = str.substringAfterLast(' ')
        val str = str.removeSuffix(last)
        val res = last.toDouble()*-1
        operation.text = " "
        operation.append(str + res)

    }*/
}