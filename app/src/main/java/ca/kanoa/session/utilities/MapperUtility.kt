package ca.kanoa.session.utilities

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

object MapperUtility {
    val jackson by lazy { jacksonObjectMapper() }
}