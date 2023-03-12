fun main() {
    val console = System.console()
    val userText = console.readLine("Give a string: ")
    val reversed = reverse(userText)
    if(reversed == userText) {
        println("it was a palindrome")
    } else {
        println("it wasn't palindrome")
    }
}

fun reverse(input: String): String {
    var reversed = ""
    for(i in input.length - 1 downTo 0) {
        reversed += input[i]
    }
    return reversed
}