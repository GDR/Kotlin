import java.io.*
import java.util.*

val inputFile = "input.txt"
val outputFile = "output.txt"

class Solution(private val sIn: FastScanner, private val sOut: PrintWriter) {

    fun solve() {

    }

}

fun main(vararg args: String) {
    try {
        FastScanner(inputFile).use { sIn ->
            PrintWriter(outputFile).use { sOut ->
                Solution(sIn, sOut).solve()
            }
        }
    } catch (e: FileNotFoundException) {
        System.err.println("File $inputFile not found")
    }
}

class FastScanner : Closeable {

    private val bufferedReader: BufferedReader
    var stringTokenizer: StringTokenizer

    override fun close() {
        bufferedReader.close()
    }

    constructor(inputStream: InputStream) {
        bufferedReader = BufferedReader(InputStreamReader(inputStream))
        stringTokenizer = StringTokenizer(bufferedReader.readLine())
    }

    constructor(file: File) : this(FileInputStream(file))

    constructor(fileName: String) : this(File(fileName))

    fun hasNext(): Boolean {
        while (!stringTokenizer.hasMoreTokens()) {
            stringTokenizer = StringTokenizer(bufferedReader.readLine())
        }
        return stringTokenizer.hasMoreTokens()
    }

    fun next(): String? {
        if (hasNext())
            return stringTokenizer.nextToken()
        return null
    }

    fun nextInt(): Int? {
        return next()?.toInt()
    }

    fun nextDouble(): Double? {
        return next()?.toDouble()
    }
}