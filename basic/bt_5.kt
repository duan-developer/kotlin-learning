import kotlin.math.pow

fun main(){
    println(" Nhap vao gia tri n: ")
    var n = readLine()?.toIntOrNull()?:0
    var goc = n
    var temp = n
    var dem = 0
    var a = mutableListOf<Int>()
    while(temp!=0){
        temp/=10
        dem++
    }
    // reset lai gia tri
    temp = n
    while(temp!=0){
        a.add(Math.pow((temp%10).toDouble(),dem.toDouble()).toInt())
        temp /=10
    }
    var tong = 0
    for(i in a.indices){
        tong +=a[i]
    }
    if(tong==goc){
        println(" Day la so ArmStrong")
    }else{
        println(" Day khong phai la so ArmStrong1")
    }

    // cach 2
    var digital = n.toString().map { it.toString().toInt() }  // tach tung phan tu 150 = [1,5,0]
    var kichthuoc = digital.size
    var sum = digital.sumOf { it.toDouble().pow(kichthuoc).toInt() }
    if(sum==n){
        println(" Day la so ArmStrong")
    }else{
        println(" Day khong phai la so ArmStrong")
    }

}