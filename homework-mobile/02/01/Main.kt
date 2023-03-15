
fun main() {
    //A
    sum(4,5, { msg -> println(msg) } )
    sum(4,5) { msg -> println(msg) }
    sum(4,5) { println(it) }
    //B
    isPositive( -4, { println("it was positive")},{ println("it was negative")})
    isPositive(5, { println("it was positive")})
                 { println("it was not positive")}
}


//Part A
fun sum(a : Int, b : Int, callback : (msg : String) -> Unit ) {
    callback("result was ${a + b}")
}


//Part B
fun isPositive(a: Int, success: () -> Unit, error: () -> Unit) {
    if(a > 0) {
        success()
    }else {error()}
}