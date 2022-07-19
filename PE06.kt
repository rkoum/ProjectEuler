fun main() {

    print(squareSum(100) - sum(100))
}

fun sum(n: Int): Long {

    return n * (n + 1) * (2 * n + 1) / 6.toLong()
}

fun squareSum(n: Int): Long {
    return n * n * (n + 1) * (n + 1) / 4.toLong()
}

