package ru.otello.applicationdesigntestmasterkotlin.application.ports

import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order

interface OrderRepository {

    fun save(order: Order): Order
}