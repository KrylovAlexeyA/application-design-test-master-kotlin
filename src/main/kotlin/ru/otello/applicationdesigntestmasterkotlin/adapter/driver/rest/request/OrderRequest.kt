package ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.request

import java.time.LocalDate

data class OrderRequest(
    val hotelId: String,
    val roomId: String,
    val email: String,
    val from: LocalDate,
    val to: LocalDate
)
