fun main(){
    println("Nhập vào số lượng: ")
    var n = readLine()?.toIntOrNull()
    if(n!=null){
        var a = mutableListOf<Int>()
        for(i in 0 until n){
            println("Nhập vào giá trị ${i+1}: ")
            var dem = readLine()?.toIntOrNull()?:0
            a.add(dem)
        }
        var b = a.sortedDescending()
        print(b[1])
    }
}