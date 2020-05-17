package eu.nets.queue.queuemessagekotlin.controller

import eu.nets.queue.queuemessagekotlin.model.PeppolDocument
import eu.nets.queue.queuemessagekotlin.repository.PeppolDocumentRepository
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class PeppolDocumentController(val peppolDocumentRepository : PeppolDocumentRepository){

    fun fetchBLockedQueue(@RequestBody listOfIds : Array<String>) = peppolDocumentRepository.findAll()

    fun resetStatusToInitial(@RequestBody listOfIds: Array<Long>) {
        listOfIds.asSequence()
                .map { peppolDocumentRepository.findById(it) }
                .map { it.block() }
                .filter { it != null }
                .mapNotNull { PeppolDocument(it!!.id,it.documentStatus,it.referenceId,it.fileId)  }
                .forEach { peppolDocumentRepository.save(it) }
    }

}