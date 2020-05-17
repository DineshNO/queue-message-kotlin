package eu.nets.queue.queuemessagekotlin.repository

import eu.nets.queue.queuemessagekotlin.model.PeppolDocument
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PeppolDocumentRepository: ReactiveCrudRepository<PeppolDocument, Long>
