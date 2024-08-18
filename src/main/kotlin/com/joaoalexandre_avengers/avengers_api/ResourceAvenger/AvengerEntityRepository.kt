package com.joaoalexandre_avengers.avengers_api.ResourceAvenger

import com.joaoalexandre_avengers.avengers_api.Avenger.Domain.AvengerRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AvengerEntityRepository : JpaRepository<AvengerEntity, Long>