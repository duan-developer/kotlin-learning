// Đếm số chữ số trong một số nguyên
fun main(){
    println(" Nhap vao so a: ")
    var a = readLine()?.toIntOrNull()?:0
    var dem = 0
    while(a!=0){
        a/=10
        dem++
    }
    println(dem)
}