fun main(){
    println("Số lượng phần tử mảng: ")
    var n = readLine()?.toIntOrNull()
    if(n!=null){
        var a = Array(n){0}  // phải khai báo vì kotlin k biết phần tử ban đầu là gì
        for(i in 0 until n){
            println("Nhập vào giá trị thứ ${i+1}: ")
            a[i] = readLine()?.toIntOrNull()?:0
        }
        a.forEach { it -> println(" $it ") }

        for(number in a){
            println("Bảng cửu chương $number ")
            for(i in 1..10){
                println(" $number * $i = ${number*i}")
            }
            println("----------")
        }
    }
}
