package com.example.androidcalculator

import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.math.MathContext
import java.math.RoundingMode
import java.math.BigDecimal


public class Calculation {
    val number = arrayOf("0","1","2","3","4","5","6","7","8","9")
    val operations = arrayOf(".","+","-","*","/")
    var res=""
    var main=""
    var str=""
    fun writeText(): String {
        if(res != ""){
            main = res
            res = ""
        }
        return "${main}${str}".trim()
    }
    fun writeText1(): String {
        if(res != ""){
            main = " "
            val str = res
            res = ""
            return "${main}sqrt(${str})".trim()
        }
        else {
            val last = str.substringAfterLast(' ')
            val str = str.removeSuffix(last)
            main = " "
            return "${main}${str}sqrt(${last})".trim()
        }
    }
    fun writeText2(): String{
        try {
            if (res != "") {
                main = res
                res = ""
            }
            val last = str.substringAfterLast(' ')
            val str = str.removeSuffix(last)
            val res = last.toDouble() * -1
            main = " "
            return "${main}${str}${res}".trim()
        }
        catch (e: Exception) {
            return "Ошибка,${e.message}"
        }
    }
    fun clear(){
        if(main.isNotEmpty())
            main=main.substring(0, main.length - 1)
        res=""
    }
    fun clearall(){
        main=""
        res=""
    }
    fun equals():String{
        try {
            val ex = ExpressionBuilder(main.toString()).build()
            //нахождение результата
            val answer = ex.evaluate()
            //округление в зависимости от результата
            val longRes = answer.toLong()
            if(answer == longRes.toDouble())

                return longRes.toString()
            else {
                val context = MathContext(5, RoundingMode.HALF_UP)
                val x = BigDecimal(answer, context)
                return x.toString()
            }
        } catch (e: Exception) {
            return "Ошибка,${e.message}"
        }
    }


}