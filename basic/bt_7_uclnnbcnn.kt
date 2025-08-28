fun UCLN(a:Int,b:Int):Int{
    var n = a
    var m = b
    if(n==0||m==0){
        return 0
    }
    var temp = 0
    while(m!=0){
        temp = n%m
        n = m
        m = temp
    }
    return n
}
fun BCNN(a:Int,b:Int):Int{
    if(a==0||b==0){
        return 0
    }
    return (a*b)/UCLN(a,b)
}
fun main(){
    var a = 18
    var b = 24
    println("UCLN la: ${UCLN(a,b)}")
    println("BCNN la: ${BCNN(a,b)}")
}

