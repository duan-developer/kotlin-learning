// Tính giai thừa của một số nguyên dương
fun main(){
    println(" Nhap vao a: ")
    var a = readLine()?.toIntOrNull()?:0
    var gt = 1
    for(i in 1..a){
        gt *=i
    }
    println(" GT = $gt")

}
