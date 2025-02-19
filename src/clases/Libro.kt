package com.dam1.eju5.src.clases

class Libro(titulo: String, autor: String, val numPaginas: Int, val isbn: String): Publicacion(titulo,autor){
    override fun mostrarInformacion() {
        println("Título: $titulo, Autor: $autor, Páginas: $numPaginas, ISBN: $isbn")
    }
}