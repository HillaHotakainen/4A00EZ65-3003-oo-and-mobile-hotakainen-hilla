class Programmer (name: String, var salary: Int): Person(name) {
    override fun drink() {
        println("$name drinks energydrink")
    }
    fun codeApps() {
        println("coding")
    }
    override fun toString(): String {
        return "name = $name, salary = $salary"
    }
}