package com.dam1.eju5.src

import com.dam1.eju5.src.clases.Blog
import com.dam1.eju5.src.clases.Libro
import com.dam1.eju5.src.clases.Revista

/**
Ejercicio 4: Sistema de Publicaciones
Crea una jerarquía de clases para modelar un sistema de publicaciones:

Clase Publicacion con atributos como título y autor, y métodos mostrarInformacion().
Subclases Libro, Revista y Blog, con atributos y métodos específicos.
Ejemplo de atributos adicionales:

Libro: numPaginas, isbn
Revista: numeroEdicion, fechaPublicacion
Blog: url, fechaPublicacion
Objetivos:
Reforzar el uso de herencia para especializar clases.
Aplicar la sobreescritura de métodos (override).
Diferenciar entre clases base y derivadas en un sistema real.
 * */

fun main(){
    val libro = Libro("El Hobbit", "J.R.R. Tolkien", 310, "978-84-450-7171-7")
    val revista = Revista("National Geographic", "Varios", 101, "Febrero 2025")
    val blog = Blog("Aprendiendo Kotlin", "Juan Pérez", "www.kotlinblog.com", "18-02-2025")

    libro.mostrarInformacion()
    revista.mostrarInformacion()
    blog.mostrarInformacion()
}