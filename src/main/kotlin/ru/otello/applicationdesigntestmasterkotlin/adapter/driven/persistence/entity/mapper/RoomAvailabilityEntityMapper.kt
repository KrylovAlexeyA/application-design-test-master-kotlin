package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.mapper

import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.RoomAvailabilityEntity
import ru.otello.applicationdesigntestmasterkotlin.application.domain.RoomAvailability

object RoomAvailabilityEntityMapper {

    fun RoomAvailabilityEntity.toDomain() =
        RoomAvailability(
            hotelId = hotelId,
            roomId = roomId,
            date = date,
            quota = quota
        )
}