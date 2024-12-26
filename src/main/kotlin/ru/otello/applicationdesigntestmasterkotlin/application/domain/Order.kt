package ru.otello.applicationdesigntestmasterkotlin.application.domain

import java.time.LocalDate

data class Order(
    val hotelId: String,
    val roomId: String,
    val userEmail: String,
    val from: LocalDate,
    val to: LocalDate
)
