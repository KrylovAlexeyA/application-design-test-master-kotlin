package ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.mapper.OrderRequestMapper.toApiRequest
import ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.mapper.OrderRequestMapper.toOrder
import ru.otello.applicationdesigntestmasterkotlin.adapter.driver.rest.request.OrderRequest
import ru.otello.applicationdesigntestmasterkotlin.application.ports.CreateOrder

@RestController
@RequestMapping("/orders")
class OrderController(
    private val createOrder: CreateOrder
) {

    @PostMapping
    fun createOrder(@RequestBody newOrderRequest: OrderRequest): ResponseEntity<OrderRequest> =
        ResponseEntity(createOrder(newOrderRequest.toOrder()).toApiRequest(), HttpStatus.CREATED)
}