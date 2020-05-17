package eu.nets.queue.queuemessagekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QueueMessageKotlinApplication

fun main(args: Array<String>) {
	runApplication<QueueMessageKotlinApplication>(*args)
}
