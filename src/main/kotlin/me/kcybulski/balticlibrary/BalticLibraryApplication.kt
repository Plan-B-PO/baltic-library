package me.kcybulski.balticlibrary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BalticLibraryApplication

fun main(args: Array<String>) {
	runApplication<BalticLibraryApplication>(*args)
}
