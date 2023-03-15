import kotlin.random.Random
import java.util.*

fun main(args: Array<String>) {
    
    if (args.size != 7) {
        println("Please give 7 integers")
        return
    }

    if (args.isNotEmpty()) {
        var argsSet = mutableSetOf<Int>()
        var win : Boolean = false

        for(i in args) {
            val number = i.toIntOrNull()
            if( number != null) argsSet.add(number)
            else { 
                println("only give integers please")
                win = true}
            }
            
            while( win != true ) {
            var matches = 0
            var counter : Double = 0.0
            var set = mutableSetOf<Int>()

            while (matches != 7) {
                set.clear()
                while (set.size < 7) set.add(Random.nextInt(1,41))
                val temp = set.intersect(argsSet).size
                counter++
                //enable this if you want to see every set of numbers
                //print(set)
                
                if(temp > matches) {
                    matches = temp
                    var years : Double = counter / 52
                    var realYears = Math.round(years * 100.0) / 100.0
                    print(set)
                    println(" - correct = $temp")
                    println("Highscore, you got $temp correct it took $realYears years")
                }
            }
            if(counter == 10.0) matches = 7
            if(matches == 7) {
            win = true
            }   //enable this if you want to see every set of numbers
                //else println("")
            
        }  
    } else println("please give 7 integer numbers")
}