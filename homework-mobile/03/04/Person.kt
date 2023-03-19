data class Person(var name : String, var age : Int) {
    override fun toString(): String {
        return "$name, $age"
    }

    //if the class was NOT data class, you would need to override the 
    //equals and hashCode methods, because normal class implements
    //Any class and the methods there are different (equals and hashCode
    //are not comparing stuff inside object, but instead the memory slots)
}