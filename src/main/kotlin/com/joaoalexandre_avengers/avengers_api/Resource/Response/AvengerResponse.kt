package com.joaoalexandre_avengers.avengers_api.Resource.Response

import com.joaoalexandre_avengers.avengers_api.Avenger.Avenger

class AvengerResponse(
    val id : Long?,
    val nick : String,
    val person : String,
    val description : String?,
    val history : String?
){
    companion object{
        fun from(avenger: Avenger) = AvengerResponse(
            id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}