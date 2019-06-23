package pl.s13302

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class InvoicesSystem

fun main(args: Array<String>) {
    runApplication<InvoicesSystem>(*args)
}