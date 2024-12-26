package ru.otello.applicationdesigntestmasterkotlin.application.ports

import ru.otello.applicationdesigntestmasterkotlin.application.domain.Order

interface CreateOrder {

    operator fun invoke(newOrder: Order): Order
}