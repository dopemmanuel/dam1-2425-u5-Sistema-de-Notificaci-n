package com.dam1.eju5.src

import com.dam1.eju5.src.interfaces.Notificable
import com.dam1.eju5.src.clases.CorreoEletronico
import com.dam1.eju5.src.clases.MensajeTexto
import com.dam1.eju5.src.clases.NotificacionPush

/**
Ejercicio 4: Sistema de Notificación
Diseña una interfaz Notificable con un método enviarNotificacion(). Implementa esta interfaz en clases
como CorreoElectronico, MensajeTexto, y NotificacionPush. Cada clase debe tener una implementación
específica de enviarNotificacion(), simulando el envío de la notificación a través del canal apropiado.

En el programa principal, crea una lista de tipo Notificable llamada notificaciones y en ella crea un
objeto de cada clase. Recorre la lista enviando una notificación con cada elemento.

Objetivos:
Aprender a utilizar interfaces para definir un comportamiento común entre varias clases.
Entender el beneficio de usar interfaces para permitir que diferentes clases sean tratadas de manera uniforme.
Practicar el diseño de sistemas flexibles donde se pueden agregar nuevos tipos de notificaciones sin modificar el código que utiliza la interfaz Notificable.
 * */

fun main(){
    val correo  = CorreoEletronico()
    val mensaje = MensajeTexto()
    val notifPush = NotificacionPush()

    val notificacion: List<Notificable> = listOf(correo, mensaje, notifPush)

    notificacion.forEach { println(it.enviarNotificacion()) }
}