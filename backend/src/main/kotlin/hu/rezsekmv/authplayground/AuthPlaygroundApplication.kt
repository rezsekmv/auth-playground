package hu.rezsekmv.authplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuthPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<AuthPlaygroundApplication>(*args)
}
