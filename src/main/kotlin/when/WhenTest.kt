package `when`

object Weather {

    const val SUNNY = "SUNNY"
    const val CLOUDY = "CLOUDY"
    const val RAINY = "RAINY"


    object Cloud {
        const val HIGH = 3
        const val MIDDLE = 2
        const val LOW = 1
        const val NONE = 0
    }

    object Sun {
        const val HIGH = 0
        const val MIDDLE = 1
        const val LOW = 2
        const val NONE = 3
    }

}

fun weatherExpect(state: Int, cloud: Int): String {
    return when (state + cloud) {
        in 0..1 -> Weather.SUNNY
        in 2..4 -> Weather.CLOUDY
        in 5..6 -> Weather.RAINY
        else -> throw Exception("Error")
    }
}

fun main() {
    println(weatherExpect(state = Weather.Sun.HIGH, cloud = Weather.Cloud.NONE))
    println(weatherExpect(state = Weather.Sun.MIDDLE, cloud = Weather.Cloud.LOW))
    println(weatherExpect(state = Weather.Sun.LOW, cloud = Weather.Cloud.MIDDLE))
    println(weatherExpect(state = Weather.Sun.NONE, cloud = Weather.Cloud.HIGH))
}