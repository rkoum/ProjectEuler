fun main() {
    val lista = mutableListOf<Int>()
    var i = 2
    lista.add(0, 0)
    lista.add(1, 1)

    while (lista[i - 1] + lista[i - 2] < 4000000) {
        lista.add(i, lista[i - 1] + lista[i - 2])
        i++
    }
    lista.filter { x -> x % 2 == 0 }
    println(lista2.sum())
}
