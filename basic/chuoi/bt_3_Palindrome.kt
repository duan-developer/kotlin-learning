fun main(){
    println("Nhập vào chuỗi a: ")
    var a = readLine()
    if(a!=null){
        var check = a
        var b = StringBuilder()
        for(i in a.length-1 downTo 0){
            b.append(a[i])
        }
        if(b.toString().equals(check)){  // chuyển sang toString() để kiểm tra
            println("Đây là chuỗi Palindrome")
        }else{
            println(" Đây không phải chuỗi Palindrome")
        }

    }

}
