fun main(){
    println(" Nhap vao a: ")
//    var a = readLine()?:""
//    var kq = a.map { it.toString().toInt() }.sum()  // sử dụng hàm map
//    println(" Ket qua: = $kq")

    var a = readLine()?.toIntOrNull()?:0
    var tong = 0
    while(a!=0){
        var dem = a%10
        a/=10
        tong+=dem
    }
    println(" Tong = $tong")


}