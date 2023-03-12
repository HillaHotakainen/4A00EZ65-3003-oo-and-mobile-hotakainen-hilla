fun main() {
    println("give a word")
    val word : String? = readLine()
    println("give an integer value")
    val value : String? = readLine()
    val myValueInt : Int? = value?.toIntOrNull()
    if (myValueInt != null) {
        for(i in myValueInt downTo 1) print(word)
    } else { print("you did not give an integer value :C ")}
}