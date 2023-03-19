class Circle (var radius: Int, var color: String?) {
    constructor(radius: Int) : this(radius, null)
    var doubleRadius = radius.toDouble()
    var Pi = 3.14159
    fun printSurfaceArea() {
        println(Pi * doubleRadius * doubleRadius)
    }
    fun attributesToString(): String {
        if(color != null) return "radius = $radius, color = $color"
        else return "radius = $radius"
    }
}