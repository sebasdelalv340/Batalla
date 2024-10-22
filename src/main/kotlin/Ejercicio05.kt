package org.example

/*
Ejercicio 5: "Determinando el Nivel del Personaje"
Crea un programa que pida el nivel de un personaje. Si el nivel es menor
a 10, debe imprimir "Personaje principiante". Si es entre 10 y 20,
"Personaje intermedio". Si es mayor a 20, "Personaje avanzado".
 */

fun pedirNivel() {

    var pedirEntero = true
    var num: Int? = null
    while (pedirEntero) {
        print("Introduce el nivel del personaje: ")
        try {
            num = readln().toInt()
            pedirEntero = false
        } catch (e: Exception) {
            println("Error ** el valor introducido no es un número entero.")
        }
    }

    if (num != null) {
        when {
            num < 10 -> println("Personaje principiante")
            num in 10..20 -> println("Personaje intermedio")
            num > 20 -> println("Personaje avanzado")
        }
    }
}