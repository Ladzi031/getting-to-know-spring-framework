fun main() {
    val eventList = mutableListOf<Event>()

    val event1 =
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    eventList.add(event1)

    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    eventList.add(event2)

    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    eventList.add(event3)

    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    eventList.add(event4)

    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    eventList.add(event5)

    val event6 =
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    eventList.add(event6)

    val shortEvents = eventList.filter { event ->
        event.durationInMinutes < 60
    }

    println("You have ${shortEvents.size} short events")

    val groupedList = eventList.groupBy { it.daypart } // returns a map
    val morning = groupedList[Daypart.MORNING]
    val evening = groupedList[Daypart.AFTERNOON]
    val afternoon = groupedList[Daypart.EVENING]

    println("morning: ${morning?.size ?: 0} events")
    println("afternoon: ${afternoon?.size ?: 0} events")
    println("evening: ${evening?.size ?: 0} events")

    println("last event of the day: ${eventList.last().title}")

    println("Duration of first event of the day: ${eventList[0].durationOfEvent}")


}

enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
