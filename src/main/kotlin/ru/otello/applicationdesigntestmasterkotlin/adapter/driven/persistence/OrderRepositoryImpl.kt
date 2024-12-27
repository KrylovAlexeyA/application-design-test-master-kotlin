package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence

import org.springframework.stereotype.Component
import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order
import ru.otello.applicationdesigntestmasterkotlin.application.ports.OrderRepository

@Component
class OrderRepositoryImpl : OrderRepository {

    private val orders = mutableListOf<Order>()

    override fun save(order: Order): Order {
        orders.add(order)
        return order
    }
}