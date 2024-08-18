package com.joaoalexandre_avengers.avengers_api.Avenger.Domain

import com.joaoalexandre_avengers.avengers_api.Avenger.Avenger

interface AvengerRepository {
    fun getDetail(id:Long?): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger) : Avenger
    fun delete (id:Long)
    fun update (avenger: Avenger): Avenger
}