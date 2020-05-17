package eu.nets.queue.queuemessagekotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class PeppolDocument(@Id var id:Long?,
                          var documentStatus : String,
                          var referenceId : String,
                          var fileId: String)