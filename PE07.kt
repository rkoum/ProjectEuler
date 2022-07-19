fun main() {
    var i = 1
    var k = 1
    do {
        i = i + 2
        if (test(i)) {
            k++
        }
    } while (k < 10001)
    println(i)
}

fun test(n: Int): Boolean {
   var l = 2
    while(l*l<=n) {
        if (n % l == 0) {
            return false
        }
        l++
    }
    return true
}
