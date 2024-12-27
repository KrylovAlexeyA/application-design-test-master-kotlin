package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence

import org.springframework.stereotype.Component
import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.OrderEntity
import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.mapper.OrderEntityMapper.toDomain
import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.mapper.OrderEntityMapper.toEntity
import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order
import ru.otello.applicationdesigntestmasterkotlin.application.ports.OrderRepository

@Component
class OrderRepositoryImpl : OrderRepository {

    private val orders = mutableListOf<OrderEntity>()

    override fun save(order: Order) = saveOrder(order.toEntity()).toDomain()

    private fun saveOrder(order: OrderEntity): OrderEntity {
        orders.add(order)
        return order
    }
}