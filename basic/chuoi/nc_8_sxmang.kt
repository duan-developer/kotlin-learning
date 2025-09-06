fun SX(a:Int,b:Int){
    var a1 = a
    var b1 = b
    var temp = a1
    a1 = b1
    b1 = temp
}

fun main(){
    print(" Nhap vao gia trij n: ")
    var n = readLine()?.toIntOrNull()
    if(n!=null){
        var a = IntArray(n)
        for(i in 0 until  n){
            println(" Nhap vao gia tri thu ${i+1}: ")
            a[i] = readLine()?.toIntOrNull()?:0
        }
//        var b = a.sortedArray()
//        b.forEach { it -> println(it) }

        for(i in 0 until n-1){
            for(j in 0 until  n-i-1){
                if(a[j]>a[j+1]){
                    var temp = a[j]
                    a[j] = a[j+1]
                    a[j+1] = temp
                }
            }
        }
        for(i in a){
            println(i)
        }

    }
}