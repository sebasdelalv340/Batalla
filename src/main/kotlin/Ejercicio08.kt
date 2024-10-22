package org.example

/*
Ejercicio 8: "Inventario de Objetos"
Crea un programa que simule un inventario de un personaje usando una
lista. El personaje puede añadir un objeto al inventario, eliminarlo o
mostrar los objetos actuales.
 */
class Personaje{

    private lateinit var objetos: MutableList<String>

    fun addObjeto(objeto: String) {
        objetos.add(objeto)
    }

    fun deleteObjeto(objeto: String) {
        if (objeto in objetos) {
            objetos.remove(objeto)
            println("$objeto ha sido borrado")
        } else {
            println("$objeto no está en el inventario")
        }
    }

    fun mostrarObjetos() {
        objetos.forEach {
            println(it)
        }
    }
}

fun menu(personaje: Personaje) {
    println("Escoge una opción:")
    val opcion = readln().toInt()

    when (opcion) {
        1 -> {
            println("Escribe el objeto a añadir: ")
            val objeto = readln()
            personaje.addObjeto(objeto)
            println("$objeto añadido.")
        }
        2 -> {
            println("Escribe el objeto a borrar: ")
            val objeto = readln()
            personaje.addObjeto(objeto)
        }
        3 -> personaje.mostrarObjetos()
    }
}