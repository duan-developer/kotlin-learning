fun main(){
//    val a = "Tran Anh Duan"
//    var b = a.reversed()
//    print(b)

    var a = "Tran Anh Duan"
    var b = StringBuilder()
    for(i in a.length -1 downTo 0){
        b.append(a[i])
    }
    println(b)
}