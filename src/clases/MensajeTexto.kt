package com.dam1.eju5.src.clases

import com.dam1.eju5.src.interfaces.Notificable

class MensajeTexto(): Notificable {

    override fun enviarNotificacion(): String {
        return "Has Recibido Mensaje de Maria!!."
    }
}