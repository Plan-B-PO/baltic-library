package me.kcybulski.balticlibrary.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id

data class Application(@Id val id: String, val name: String,
                       val description: String, val icon: String,
                       val schema: List<StepParameter<Any>>)