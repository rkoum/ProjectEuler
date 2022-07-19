fun main() {
    var lista = mutableListOf<Long>(2)
    for (i in 3..2000000 step 2)
        if (test(i)) {
            lista.add(i.toLong())
        }
    println(lista.sum())
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
