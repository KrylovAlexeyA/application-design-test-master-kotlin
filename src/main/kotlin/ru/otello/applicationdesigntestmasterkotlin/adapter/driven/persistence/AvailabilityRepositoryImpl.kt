package ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence

import org.springframework.stereotype.Component
import ru.otello.applicationdesigntestmasterkotlin.adapter.driven.persistence.entity.RoomAvailabilityEntity
import ru.otello.applicationdesigntestmasterkotlin.application.ports.AvailabilityRepository
import java.time.LocalDate

@Component
class AvailabilityRepositoryImpl : AvailabilityRepository {

    private val availability = mutableListOf(
        RoomAvailabilityEntity("reddison", "lux", LocalDate.parse("2024-01-01"), 1),
        RoomAvailabilityEntity("reddison", "lux", LocalDate.parse("2024-01-02"), 1),
        RoomAvailabilityEntity("reddison", "lux", LocalDate.parse("2024-01-03"), 1),
        RoomAvailabilityEntity("reddison", "lux", LocalDate.parse("2024-01-04"), 1),
        RoomAvailabilityEntity("reddison", "lux", LocalDate.parse("2024-01-05"), 0)
    )

    override fun findUnavalableDays(daysToBook: List<LocalDate>): Collection<LocalDate> {
        val unavailableDays = mutableSetOf<LocalDate>()

        for (day in daysToBook) {
            unavailableDays.add(day)
        }

        for (dayToBook in daysToBook) {
            for (availabilityItem in availability) {
                if (availabilityItem.date != dayToBook || availabilityItem.quota < 1) {
                    continue
                }
                availabilityItem.quota -= 1
                unavailableDays.remove(dayToBook)
            }
        }

        return unavailableDays
    }
}