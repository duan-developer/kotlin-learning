fun NguyenTo(n:Int):Boolean{
    if(n<2){
        return false
    }else{
        for(i in 2..Math.sqrt(n.toDouble()).toInt()){
            if(n%i==0){
                return false
            }
        }
    }
    return true
}
fun main(){
    println("Nhập vào giá trị n: ")
    var n = readLine()?.toIntOrNull()?:0
    for(i in 2 until n){
        if(NguyenTo(i)){
            print(" $i ")
        }
    }
}