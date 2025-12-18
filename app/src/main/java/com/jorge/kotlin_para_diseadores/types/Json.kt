package com.jorge.kotlin_para_diseadores.types

import com.google.gson.annotations.SerializedName

data class Descripciones(
    val layouts: List<ArchivosYCarpeta>,

    @SerializedName("componentes_ui")
    val componentesUI: List<ArchivosYCarpeta>,

    @SerializedName("archivos_y_carpetas")
    val archivosYCarpetas: List<ArchivosYCarpeta>,

    @SerializedName("conceptos_clave")
    val conceptosClave: List<ArchivosYCarpeta>
)

data class ArchivosYCarpeta(
    val id: String,
    val titulo: String,
    val descripcion: String
)