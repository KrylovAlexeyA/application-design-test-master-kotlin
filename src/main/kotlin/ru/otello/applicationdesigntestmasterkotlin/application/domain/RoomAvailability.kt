package ru.otello.applicationdesigntestmasterkotlin.application.domain

import java.time.LocalDate

data class RoomAvailability(
    val hotelId: String,
    val roomId: String,
    val date: LocalDate,
    var quota: Int
)
