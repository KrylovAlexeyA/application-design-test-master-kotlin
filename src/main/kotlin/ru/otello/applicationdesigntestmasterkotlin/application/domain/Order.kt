package ru.otello.applicationdesigntestmasterkotlin.application.domain

import java.time.LocalDate

data class Order(
    val hotelId: String,
    val roomId: String,
    val email: String,
    val from: LocalDate,
    val to: LocalDate
)
