fun convertBase(num: String, fromBase: Int, toBase: Int): String {
    return num.toInt(fromBase).toString(toBase)
}

fun main() {
    println(convertBase("1101", 2, 16))  // từ nhị phân sang hex = "d"
    println(convertBase("FF", 16, 2))    // từ hex sang nhị phân = "11111111"
    println(convertBase("377", 8, 10))   // từ bát phân sang thập phân = "255"
}
