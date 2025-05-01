package com.example.androidbasics.com.example.androidbasics

fun main() {
    piNumber()
    imprimirMensaje()
    probarBool(true)
    pedirDatos()
}

fun piNumber() {
    val pi = 3.14159265359
    println(pi)
}

fun imprimirMensaje() {
    val mensaje = "Hola"
    println(mensaje)
}

fun probarBool(choice: Boolean){
    if (choice){
        println("Yes")
    } else{
        println("No")
    }
}

fun pedirDatos(){
    println("Dame tu nombre")
    val nombre = readLine()
    println("Dame tu edad")
    val edad = readLine()

    println("""
        ***Datos***
        Nombre: $nombre
        Edad: $edad años
    """.trimIndent())
}