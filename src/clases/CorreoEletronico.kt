package com.dam1.eju5.src.clases

import com.dam1.eju5.src.interfaces.Notificable

class CorreoEletronico(): Notificable {
    override fun enviarNotificacion(): String {
        return "Has Recibido un correo!!."
    }
}