package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity

import java.time.LocalDate

data class OrderEntity(
    val hotelId: String,
    val roomId: String,
    val email: String,
    val from: LocalDate,
    val to: LocalDate
)
