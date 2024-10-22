package org.example

import org.example.Batalla.Batalla

fun main() {
    val batalla = Batalla()
    val personaje = Personaje()

    var pedirEntero = true
    var num: Int? = null
    while (pedirEntero) {
        print("Introduce el número de un ejercicio: ")
        try {
            num = readln().toInt()
            pedirEntero = false
        } catch (e: Exception) {
            println("Error ** el valor introducido no es un número entero.")
        }
    }

    when (num) {
        1 -> holaMundo()
        2 -> vidaPersonaje()
        3 -> mostrarDamage()
        4 -> recogerMonedas()
        5 -> pedirNivel()
        6 -> golpeCritico()
        7 -> batalla.jugar()
        8 -> menu(personaje)
    }


}