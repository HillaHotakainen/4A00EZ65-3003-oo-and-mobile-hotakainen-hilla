import kotlin.random.Random

fun main(args: Array<String>) {
    //val jack1 = Person("jack", 30)
    //val jack2 = Person("jack", 30)
    //when NOT using data class:
    //prints out the class name and hashcode of the object
    //when using dataclass, prints out name of class and the object in it,
    //in this case: Person(name=jack, age=30)
    //println(jack1.toString())
    //when NOT using data class:
    //compares the memory slots so prints false
    //When using data class, compares the two given objects, not memory slots
    //println(jack1.equals(jack2))
    //you can use the copy function to make new object out of already exsisting one
    //with same values as the exsisting one
    //the cpoy function does not exsist for normal classes, only the data class
    //val jack3 = jack1.copy()
    //println(jack3.toString())

    val size = args[0].toInt()
    val persons = mutableListOf<Person>()
    for (i in size downTo 1) {
        val name = listOf("tina", "jack", "hannah").random()
        val age = Random.nextInt(1,100)
        val person = Person(name, age)
        persons.add(person)
    }
    val distList = persons.distinct()
    distList.forEach {println(it)}
}