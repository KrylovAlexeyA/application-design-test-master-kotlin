package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity

import java.time.LocalDate

data class RoomAvailabilityEntity(
    val hotelId: String,
    val roomId: String,
    val date: LocalDate,
    var quota: Int
)