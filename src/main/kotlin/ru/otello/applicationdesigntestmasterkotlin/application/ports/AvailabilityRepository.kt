package ru.otello.applicationdesigntestmasterkotlin.application.ports

import java.time.LocalDate

interface AvailabilityRepository {

    fun findUnavalableDays(daysToBook: List<LocalDate>): Collection<LocalDate>
}