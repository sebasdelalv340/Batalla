package org.example.Batalla

import kotlin.random.Random

class Personaje(
    var vida: Int,
    val ataque: Int
) {
    fun atacar(): Int{
        val damageRandom = Random.nextInt(1, ataque)
        return damageRandom
    }

    fun recieveDamage(damage: Int) {
        vida -= damage
        if (vida < 0) {
            vida = 0
        }
    }
}