package ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.mapper

import ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.request.OrderRequest
import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order

object OrderRequestMapper {

    fun OrderRequest.toOrder() =
        Order(
            hotelId = hotelId,
            roomId = roomId,
            userEmail = email,
            from = from,
            to = to,
        )

    fun Order.toApiRequest() =
        OrderRequest(
            hotelId = hotelId,
            roomId = roomId,
            email = userEmail,
            from = from,
            to = to,
        )
}