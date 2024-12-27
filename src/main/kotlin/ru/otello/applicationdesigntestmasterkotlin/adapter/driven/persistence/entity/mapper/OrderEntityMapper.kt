package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.mapper

import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.OrderEntity
import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order

object OrderEntityMapper {

    fun OrderEntity.toDomain() =
        Order(
            hotelId = hotelId,
            roomId = roomId,
            email = email,
            from = from,
            to = to,
        )

    fun Order.toEntity() =
        OrderEntity(
            hotelId = hotelId,
            roomId = roomId,
            email = email,
            from = from,
            to = to,
        )
}