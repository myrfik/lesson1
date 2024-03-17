package org.example.lesson_1_task_5

fun main() {
    var secondsOfSpace: Short = 6480

    val hour: Int = secondsOfSpace / secondInHour
    val remainingSeconds = secondsOfSpace % secondInHour
    var minutes: Int = remainingSeconds / secondInMinute
    val seconds: Int = secondsOfSpace % secondInMinute

    println(String.format("%02d:%02d:%02d", hour, minutes, seconds))
}

const val secondInHour = 3600
const val secondInMinute = 60