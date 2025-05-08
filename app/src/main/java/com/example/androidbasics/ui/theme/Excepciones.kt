package com.example.androidbasics.ui.theme

fun main(){

    try {
        val valor = readLine()!!.toDouble()
        println(valor)
    } catch (e: Exception){
        println("Error: ${e.localizedMessage}")
    }

}