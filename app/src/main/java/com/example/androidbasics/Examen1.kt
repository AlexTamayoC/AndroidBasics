package com.example.androidbasics

var radio = 0.0
val pi = 3.1416

fun main (){

    val formato = "#,###.00"

    leerParametros()
    println("""
        *** Centimetros***
        Area            |   ${calcularAreaCm()}
        Circunferencia  |   ${calcularPerimetroCm()}
        
        *** Pulgadas ***
        Area            |   ${calcularAreaIn()}
        Circunferencia  |   ${calcularPerimetroIn()}
    """.trimIndent())
}

fun leerParametros(){
    println("Dame el radio del circulo (cm): ")
    radio = readln().toDouble()

}

fun calcularAreaCm(): Double{
    val areaCm = pi * radio * radio
    return areaCm
}

fun calcularPerimetroCm(): Double{
    val perimetroCm = 2*pi* radio
    return perimetroCm
}

fun calcularAreaIn(): Double{
    val areaInches = pi * radio/2.54 * radio/2.54
    return areaInches
}

fun calcularPerimetroIn(): Double{
    val perimetroInches = 2*pi* radio/2.54
    return perimetroInches
}