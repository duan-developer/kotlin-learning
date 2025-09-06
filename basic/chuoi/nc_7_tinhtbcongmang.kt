fun main(){
    println("Nhập vào số lượng phần tử mảng: ")
    var n = readLine()?.toIntOrNull()?:0
    var a = IntArray(n)
    for(i in 0 until n){
        println("Nhập vào giá trị thứ ${i+1}: ")
         a[i] = readLine()?.toIntOrNull()?:0
    }
    var tbcong = a.size
    var tong = 0
    for(i in a.indices){
        tong += a[i]
    }
    var tbc = tong/tbcong
    println(tbc)
}