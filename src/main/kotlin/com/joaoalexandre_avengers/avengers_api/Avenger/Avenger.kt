package com.joaoalexandre_avengers.avengers_api.Avenger

data class Avenger (
    val id : Long? = null,
    val nick : String,
    val person : String,
    val description : String?,
    val history : String?
)