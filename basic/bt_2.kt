// Kiểm tra một số có phải số nguyên tố không.
fun NT(a:Int):Boolean{
    if(a<2){
        return false
    }
    else{
        for(i in 2..Math.sqrt(a.toDouble()).toInt()){
            if(a%i==0){
                return false
            }
        }
        return true
    }
}
fun main(){
    println(" Nhap vao a: ")
    var a = readLine()?.toIntOrNull()?:0
    for(i in 1..a){
        if(NT(i)){
            print(" $i ")
        }
    }

}