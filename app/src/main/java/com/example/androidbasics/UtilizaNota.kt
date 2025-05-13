package com.example.androidbasics

import java.util.Date

fun main(){

    val nota1= Nota()
    nota1.nombre = "Alex"
    nota1.contenido = "Prueba de clases"

    val nota2= Nota()

    nota2.nombre = "Alejandro"
    nota2.contenido = "Contenido actualizado"
    nota2.fechaCreacion = Date()

    val listaNotas = arrayListOf<Nota>()

    listaNotas.add(nota1)
    listaNotas.add(nota2)

    listaNotas.forEach{
        println("""
            ${it.nombre}
            ${it.contenido}
            ${it.fechaCreacion}
            --------------------------------
    """.trimIndent())
    }

}