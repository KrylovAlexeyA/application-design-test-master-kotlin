package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence

import org.springframework.stereotype.Component
import ru.otello.applicationdesigntestmasterkotlin.application.ports.OrderRepository

@Component
class OrderRepositoryImpl : OrderRepository {

    private val orders = mutableListOf<ru.otello.applicationdesigntestmasterkotlin.application.domain.Order>()

    override fun save(order: ru.otello.applicationdesigntestmasterkotlin.application.domain.Order): ru.otello.applicationdesigntestmasterkotlin.application.domain.Order {
        orders.add(order)
        return order
    }
}