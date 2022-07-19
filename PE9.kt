fun main() {
    var a: Int
    var b: Int
    var c: Int

    for (a in 1..1000) {
        for (b in (a + 1)..1000) {
            c = 1000 - a - b
            if (a + b + c == 1000 && a * a + b * b == c * c) {
                println(a * b * c)
            }
        }
    }
}
