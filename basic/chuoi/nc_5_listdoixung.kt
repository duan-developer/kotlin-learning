fun DoiXung(list:List<Int>):Boolean{
    var n = list.size
    for(i in 0 until n/2){
        if(list[i]!=list[n-i-1]){
            return false
        }
    }
    return true
}
fun main(){
    println("Nhập vào số lượng: ")
    var n = readLine()?.toIntOrNull()
    if(n!=null){
        var a = mutableListOf<Int>()
        for(i in 0 until n){
            println("Nhập vào giá trị thứ ${i+1}: ")
            var check = readLine()?.toIntOrNull()?:0
            a.add(check)
        }
        var check = true
        for(i in 0 until n/2){
            if(a[i]!=a[n-i-1]){
                check = false
            }
        }
        if(check){
            println("Đây là list đối xứng ")
        }else{
            println(" Đây không phải là list đối xứng ")
        }
    }
}