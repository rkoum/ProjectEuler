fun main() {

    var i = 3
    var number = 600851475143
    while (i <= number) {
        if (number % i != 0.toLong()) {
            i += 2
        } else if (number % i == 0.toLong()) {
            number = number / i

        }
    }
    println(i)
}
