package me.kcybulski.balticlibrary.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Application(@Id val id: String, val name: String,
                       val description: String, val icon: String,
                       val schema: List<StepParameter<Any>>)