import java.io.File
import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val input = File("input.txt").bufferedReader()
    val output = File("output.txt").bufferedWriter()
    var inc = 0
    //Store the current line in "line"
    var line = input.readLine().toLowercase();
    inc++
    //If the next line is equal to line, increment inc
    //If inc >= 4, write line to output
    while (line != null) {
        var nextLine = input.readLine().toLowercase()
        if (line == nextLine) {
            inc++
            if (inc >= 4) {
                output.write(line)
                output.newLine()
                inc = 0
            }
            //Otherwise, store the current line in "line"
        } else {
            line = nextLine
            inc = 1
        }
        line = input.readLine().toLowercase()
    }

    input.close()
    output.close()
}
