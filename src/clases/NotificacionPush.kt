package com.dam1.eju5.src.clases

import com.dam1.eju5.src.interfaces.Notificable

class NotificacionPush(): Notificable {
    override fun enviarNotificacion(): String {
        return "Alerta! Se ha detectado movimiento en la camara 2"
    }
}