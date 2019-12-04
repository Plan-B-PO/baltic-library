package me.kcybulski.balticlibrary.domain

data class StepParameter<T>(val name: String, val type: String, val defaultValue: T)