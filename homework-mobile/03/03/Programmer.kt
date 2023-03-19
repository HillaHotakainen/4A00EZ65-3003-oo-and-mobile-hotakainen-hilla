class Programmer (name: String, var givenSalary: Int): Person(name) {
    var salary = givenSalary
        set(value) {
            if(value > 0) {
                field = value
            } else {
                throw IllegalArgumentException("salary must be > 0.")
            }
        }
    
    init {
        this.salary = salary
    }

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