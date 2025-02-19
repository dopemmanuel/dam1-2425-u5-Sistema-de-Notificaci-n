package com.dam1.eju5.src.clases

open class Publicacion(val titulo: String, val autor: String){

    open fun mostrarInformacion(){
        println("Titulo: $titulo - Autor:$autor")
    }
}