package org.example

/*
Ejercicio 3: "Multiplicando Ataques"
Escribe una función llamada multiplicarAtaques que tome un número
entero como argumento y lo multiplique por 5. Usa esa función para
calcular y mostrar el daño total de 3 ataques.
 */

fun multiplicarAtaques(num: Int): Int {
    val ataque = num * 5
    return ataque
}

fun mostrarDamage(){
    for (i in 1..3) {
        println("Ataque $i - daño: ${multiplicarAtaques(i)}")
    }
}