import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var i = 0
    var count = 0

    while (i + 1 < c.size) {
        if (i + 2 < c.size && c[i + 2] == 0) {
            count += 1
            i += 2
        } else {
            count += 1
            i += 1
        }
    }

    return count
}

fun main(args: Array<String>) {
    readLine()!!.trim().toInt()
    val c = readLine()!!.trim().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}