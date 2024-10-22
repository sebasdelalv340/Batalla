package org.example.Batalla

/*
Ejercicio 7: "Combate de dos personajes"
Crea un programa que simule el combate entre dos personajes. Cada
uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
ataca a B y viceversa, restando vida. El combate termina cuando uno de
los personajes tiene 0 o menos de vida.
 */

class Batalla {
    fun jugar(){
        val elfo: Personaje = Personaje(100, 6)
        val orco: Personaje = Personaje(100, 5)

        while (elfo.vida > 0 && orco.vida > 0) {
            orco.recieveDamage(elfo.atacar())
            elfo.recieveDamage(orco.atacar())
        }

        if (elfo.vida == 0) {
            println("El orco gana la batalla.")
        } else {
            println("El elfo gana la batalla.")
        }
    }
}