fun main() {
    var jack = Person("Jack Smith")
    println(jack.name)
    val c = Circle(radius = 5, color = "red")
    println(c.radius)
    println(c.attributesToString())
    c.printSurfaceArea()
    val c1 = Circle(radius = 6, color = "blue")
    val c2 = Circle(radius = 7)
    println(c1.attributesToString())
    println(c2.attributesToString())
}