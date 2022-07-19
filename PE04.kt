fun main() {
    var lista = mutableListOf<Int>()
    var product = 0
    for (a in 100..1000) {
        for (b in 100..1000) {
            product = a * b
            if (product.toString().length == 6 &&
                product.toString()[0] == product.toString()[5] &&
                product.toString()[1] == product.toString()[4] &&
                product.toString()[2] == product.toString()[3] ||
                product.toString().length == 5 &&
                product.toString()[0] == product.toString()[4] &&
                product.toString()[1] == product.toString()[3]
            ) {
                lista.add(product)
            }
        }
    }
    print(lista.maxOrNull())
}
