// vòng lặp for
fun Fi1(n:Int):Int{
    if(n<=1){
        return n
    }
    var a = 0
    var b = 1
    var result = 1
    for(i in 2..n){
        result = a +b
        a = b
        b = result
    }
    return result
}

// đệ quy
fun Fi2(n:Int):Int{
    if(n<=1){
        return  n
    }
    return Fi2(n-1)+Fi2(n-2)
}

// quy hoặc động
fun Fi3(n:Int):Int{
    if(n<=1){
        return n
    }
    var f = IntArray(n)
    f[0]=0
    f[1]=1
    for(i in 2..n){
        f[i] = f[i-1]+f[i-2]
    }
    return f[n]
}
fun main(){
    var a = 5
    println(" Kq f1 = ${Fi1(a)}")
    println(" Kq f2 = ${Fi2(a)}")
    for(i in 0..5){
        print(" ${Fi2(i)} ")
    }
}
