/**
Exercise: Polymorphism
A TV can provide programs from a certain channel.

It can also provide channel and subtitle information.

It can also provide programs that were shown at a certain time of the day.

Implement this in a program and call the various methods.
 */

fun main(args: Array<String>) {
    val tv = Tv()
    tv.channel("Ch.3")
    tv.channel("Ch.3", true)
    tv.channel("Ch.3", "12:00")
}

class Tv {
    fun channel(channelName: String) {
        println("Show starting on $channelName.")
    }

    fun channel(channelName: String, subtitleInfo: Boolean) {
        println("Show starting on $channelName with ${if (subtitleInfo) "subtitle." else "no subtitle."}")
    }

    fun channel(channelName: String, showsTimeSlot: String) {
        println("Show starting on $channelName with timeslot $showsTimeSlot.")
    }

}