package com.dam1.eju5.src.clases

class Revista(titulo: String, autor: String, val numeroEdicion: Int, val fechaPublicacion: String) : Publicacion(titulo, autor) {
    override fun mostrarInformacion() {
        println("Título: $titulo, Autor: $autor, Edición: $numeroEdicion, Fecha de publicación: $fechaPublicacion")
    }
}