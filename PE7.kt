fun main() {
    var i = 1
    var k = 1
    do {
        i = i + 2
        if (test(i)) {
            k++
        }
    } while (k <= 10001)
    println(i)
}

fun test(n: Int): Boolean {
    for (l in 2..n / 2) {
        if (n % l == 0) {
            return false
        }
    }
    return true
}
