// tổng từ 1 đến n
fun main(){
    println(" Nhap vao n: ")
    var n = readLine()?.toIntOrNull()
    if(n!=null){
        var tong = 0
        for(i in 1..n){
            tong +=i
        }
        println("Tong = $tong")
    }
}