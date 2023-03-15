
fun main(arguments: Array<String>) {
    arguments.filter{it.length <= 5}.map{it.uppercase()}.forEach{println(it)}
}