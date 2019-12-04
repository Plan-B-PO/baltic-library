package me.kcybulski.balticlibrary.persist

import me.kcybulski.balticlibrary.domain.Application
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApplicationsRepository: JpaRepository<Application, String>