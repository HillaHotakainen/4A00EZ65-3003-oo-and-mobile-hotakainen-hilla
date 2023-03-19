fun main() {
    val tina = Programmer("Tina", 4000)
    tina.drink()
    tina.sleep()
    tina.codeApps()
    println(tina.toString())

    val jack = Person("Jack")
    jack.drink()
    jack.sleep()
    println(jack.toString())
}