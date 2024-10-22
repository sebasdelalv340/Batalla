package org.example

import kotlin.random.Random

/*
Ejercicio 6: "Batalla de Daño Crítico"
Escribe una función que simule una batalla. El daño crítico se hace
cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
"¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
solo devuelve el daño normal.
 */

fun golpeCritico() {
    val damage = Random.nextInt(1, 100)

    if (damage > 50) {
        println("¡Golpe crítico! - $damage")
    } else {
        println("Daño normal - $damage")
    }
}