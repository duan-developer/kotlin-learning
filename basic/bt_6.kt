// Kiểm tra số có phải số hoàn hảo không
fun main(){
    println(" Nhap vao gia tri n: ")
    var n = readLine()?.toIntOrNull()?:0
    var tong = 0
    for(i in 1 until n){
        if(n%i==0){
            tong +=i
        }
    }
    if(tong==n){
        println(" Đây là số hoàn hảo")
    }else{
        println(" Day khong phai la so hoan hao")
    }
}