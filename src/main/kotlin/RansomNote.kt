import java.util.*

// Complete the checkMagazine function below.
fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val map = hashMapOf<String, Int>()
    magazine.forEach {
        val v = map.getOrDefault(it, 0)
        map[it] = v + 1
    }

    note.forEach {
        val v = map.getOrDefault(it, 0)
        if (v == 0) {
            println("No")
            return
        } else {
            map[it] = v - 1
        }
    }

    println("Yes")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}