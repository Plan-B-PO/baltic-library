package me.kcybulski.balticlibrary.domain

import me.kcybulski.balticlibrary.persist.ApplicationsRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ApplicationsService(private val repository: ApplicationsRepository) {

    fun add(request: ApplicationRequest): Application {
        val uuid = UUID.randomUUID().toString()
        val application = Application(uuid, request.name, request.description, request.icon, request.schema)
        return repository.save(application)
    }

    fun list(): List<Application> = repository.findAll()

    fun get(id: String): Application? = repository.getOne(id)

}