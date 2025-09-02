fun main(){
    println("Nhap vao gia tri a: ")
    var a = readLine()?.toIntOrNull()?:0
    if(a%3==0&&a%5==0){
        println(" $a chia het cho 3 va 5")
    }else{
        println("$a khong chia het cho 3 va 5")
    }
}