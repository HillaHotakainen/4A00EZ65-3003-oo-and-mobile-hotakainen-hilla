import kotlin.random.Random

class Person {
    val computer: Computer? = if (generateRandomBoolean()) Computer() else null
}

class Computer {
    val display: Display? = if (generateRandomBoolean()) Display() else null
}

class Display {
    val usbc: UsbC? = if (generateRandomBoolean()) UsbC() else null
}

class UsbC {
    val speed: Int = if (generateRandomBoolean()) 40 else 20
}

fun generateRandomBoolean(): Boolean {
    return Random.nextBoolean()
}

fun main() {
    val jack = Person()
    //A
    if(jack.computer != null && jack.computer.display != null && jack.computer.display.usbc != null) println(jack.computer.display.usbc.speed)
    //B
    println(jack.computer?.display?.usbc?.speed)
    //C
    //println(jack.computer!!.display!!.usbc!!.speed)
    //D
    println(jack.computer?.display?.usbc?.speed.toString() ?: "Couldn't find speed")


}