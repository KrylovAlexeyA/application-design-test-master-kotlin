package ru.otello.applicationdesigntestmasterkotlin.application.usecase

import org.springframework.stereotype.Service
import ru.otello.applicationdesigntestmasterkotlin.application.ports.AvailabilityRepository
import ru.otello.applicationdesigntestmasterkotlin.application.ports.CreateOrder
import ru.otello.applicationdesigntestmasterkotlin.application.ports.OrderRepository
import java.time.LocalDate

@Service
class CreateOrderImpl(
    private val availabilityRepository: AvailabilityRepository,
    private val orderRepository: OrderRepository,
) : CreateOrder {

    // @Transactional
    override fun invoke(newOrder: ru.otello.applicationdesigntestmasterkotlin.application.domain.Order): ru.otello.applicationdesigntestmasterkotlin.application.domain.Order {
        val daysToBook = daysBetween(newOrder.from, newOrder.to)
        val unavailableDays = availabilityRepository.findUnavalableDays(daysToBook)

        if (unavailableDays.isNotEmpty()) {
            logError("Hotel room is not available for selected dates:\n$newOrder\n$unavailableDays")
            throw Exception("Hotel room is not available for selected dates")
        }

        orderRepository.save(newOrder)

        logInfo("Order successfully created: $newOrder")
        return newOrder
    }

    private fun daysBetween(from: LocalDate, to: LocalDate): List<LocalDate> {
        if (from.isAfter(to)) {
            return emptyList()
        }

        return generateSequence(from) { it.plusDays(1) }
            .takeWhile { !it.isAfter(to) }
            .toList()
    }

    private fun logError(message: String) {
        println("[Error]: $message")
    }

    private fun logInfo(message: String) {
        println("[Info]: $message")
    }
}