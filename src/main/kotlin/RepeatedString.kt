import java.util.*

fun repeatedString(s: String, n: Long): Long {
    val countPerString =  s.filter { it == 'a' }.count()

    val v = n / s.length
    val mod = n % s.length

    var modCount = 0
    for (i in 0 until mod.toInt()) {
        if (s[i] == 'a') {
            modCount += 1
        }
    }

    return v * countPerString + modCount

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}