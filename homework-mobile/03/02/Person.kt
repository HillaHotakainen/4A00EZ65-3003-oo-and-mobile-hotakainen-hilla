open class Person (var name: String) {
    open fun drink() {
        println("$name drinks water")
    }
    fun sleep() {
        println("sleeping")
    }
    override fun toString(): String {
        return "name = $name"
    }
}