fun main(){
    println(" Nhập vào gía trị a: ")
    var a = readLine()?.toIntOrNull()
    if(a!=null){
        var check = a
        var index = 0
        while(a!=0){
            var dem = a%10
            index = index *10 +dem
            a/=10
        }
        if(index==check){
            println(" Đây là số số Palindrome")
        }else{
            println(" Đây không phải là số số Palindrome")
        }
    }


}