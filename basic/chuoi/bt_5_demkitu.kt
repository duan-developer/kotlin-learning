fun main() {
    println("Nhập vào một chuỗi: ")
    val text = readLine() ?: ""

    var soChuCai = 0
    var soChuSo = 0
    var soKhoangTrang = 0
    var soKyTuDacBiet = 0

    for (ch in text) {
        when {
            ch.isLetter() -> soChuCai++
            ch.isDigit() -> soChuSo++
            ch.isWhitespace() -> soKhoangTrang++
            else -> soKyTuDacBiet++
        }
    }

    println("Kết quả thống kê:")
    println("Số chữ cái: $soChuCai")
    println("Số chữ số: $soChuSo")
    println("Số khoảng trắng: $soKhoangTrang")
    println("Số ký tự đặc biệt: $soKyTuDacBiet")
}
