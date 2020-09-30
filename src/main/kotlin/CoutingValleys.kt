
/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(_steps: Int, path: String): Int {
    // Write your code here
    var sum = 0
    var vallyCount = 0

    path.forEach {
        if (it == 'D') {
            sum -= 1
            if (sum == -1) {
                vallyCount += 1
            }
        } else {
            sum += 1
        }
    }
    return vallyCount
}

fun main() {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}