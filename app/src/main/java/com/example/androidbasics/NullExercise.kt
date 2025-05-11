package com.example.androidbasics

import java.util.Locale

fun main () {
    nullSafe()
}

fun checkNull(){
    try {
        val entrada = readLine()

        val lado = entrada?.toDouble() ?: 0.0

        val resultado = lado * lado

        println(resultado)
    } catch (e: Exception){
        println("Entrada no valida")
    }
}

fun nullSafe() {
    var entrada = readLine()
    entrada = entrada?.uppercase(Locale.ROOT)
    println(entrada)
}

