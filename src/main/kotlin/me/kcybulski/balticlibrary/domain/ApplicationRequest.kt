package me.kcybulski.balticlibrary.domain

data class ApplicationRequest(val name: String, val description: String,
                              val icon: String, val schema: List<StepParameter<Any>>)