fun main() {
    var sum = 0
    var i = 1

    while (diair(sum) < 500) {
        i++
        sum = i * (i + 1) / 2

    }
    println(sum)
}

fun diair(k: Int): Int {
    var counter = 1
    var i = 0
    while (i <= k / 2) {
        i++
        if (k % i == 0) {
            counter++
        }
    }

    return counter
}
