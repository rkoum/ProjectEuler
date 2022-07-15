fun main() {
    var i = 0
    val lista = (11..20).toList()

    do {
        i++
    } while (lista.filter{ i%it!=0 }.size>0
    )
    println(i)
}
