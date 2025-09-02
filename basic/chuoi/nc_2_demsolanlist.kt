fun main(){
    // đếm số lần xuất hiện của phần tử trong list
    println("Nhập vào số lượng: ")
    var n = readLine()?.toIntOrNull()
    var dem = 2
    if(n!=null){
        var a = mutableListOf<Int>()
        for(i in 0 until n){
            println("Nhập vào giá trị thứ ${i+1}: ")
            var check = readLine()?.toIntOrNull()?:0
            a.add(check)
        }
        var tong = 0
        for(i in a.indices){
            if(a[i]==dem){
                tong++
            }
        }
        println("Phần tử $dem xuat hien $tong lan")
        a.forEach { it -> println(it) }
    }

}