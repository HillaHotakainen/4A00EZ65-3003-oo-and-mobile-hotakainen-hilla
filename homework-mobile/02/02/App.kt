import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    var x = 0
    args.forEach {
        var fileLines = (Files.readAllLines(Paths.get(args[x])))
        fileLines.forEach { line -> 
            if (line.contains("\t")) {
                println(line.replace("\t", "____"))
            } 
        }
        x++
    }
}