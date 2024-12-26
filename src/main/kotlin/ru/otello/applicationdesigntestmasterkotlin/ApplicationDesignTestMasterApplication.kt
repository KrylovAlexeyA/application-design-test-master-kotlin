package ru.otello.applicationdesigntestmasterkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HotelBookingApplication

fun main(args: Array<String>) {
    runApplication<HotelBookingApplication>(*args)
}