package com.jorge.kotlin_para_disenadores.utils

import com.jorge.kotlin_para_disenadores.types.Descripciones
import com.jorge.kotlin_para_disenadores.types.Identificable

fun Descripciones.todosLosIdentificables(): List<Identificable> {
    val resultado = mutableListOf<Identificable>()

    if (layouts.isNotEmpty()) resultado.addAll(layouts)
    if (botones.isNotEmpty()) resultado.addAll(botones)
    if (componentesUi.isNotEmpty()) resultado.addAll(componentesUi)
    if (notificacionesUi.isNotEmpty()) resultado.addAll(notificacionesUi)
    if (activitiesYCiclo.isNotEmpty()) resultado.addAll(activitiesYCiclo)
    if (archivosYConfiguracion.isNotEmpty()) resultado.addAll(archivosYConfiguracion)
    if (programacionPoo.isNotEmpty()) resultado.addAll(programacionPoo)
    if (tiposDeDatos.isNotEmpty()) resultado.addAll(tiposDeDatos)
    if (kotlinAvanzadoYLog.isNotEmpty()) resultado.addAll(kotlinAvanzadoYLog)

    return resultado
}
