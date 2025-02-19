package com.dam1.eju5.src.clases

class Blog(titulo: String, autor: String, val url: String, val fechaPublicacion: String) : Publicacion(titulo, autor) {
    override fun mostrarInformacion() {
        println("Título: $titulo, Autor: $autor, URL: $url, Fecha de publicación: $fechaPublicacion")
    }
}