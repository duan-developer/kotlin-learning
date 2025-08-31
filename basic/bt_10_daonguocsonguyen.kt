fun main(){
     println(" Nhập vào giá trị a: ")
    // Cách 1 dùng toán học cơ bản
//    var a = readLine()?.toIntOrNull()?:0
//    var index = 0
//    while(a!=0){
//        var dem = a%10
//        index = index * 10 +dem
//        a/=10
//    }
//    print(index)

    // Cách 2 dùng chuỗi
//    var a = readLine()?:""
//    print(a.reversed())

    // Cách 3 dùng stringbuilder
   var a = readLine()?.toIntOrNull()?:0
    var check = StringBuilder()
    while(a!=0){
        check.append(a%10)
        a/=10

    }
    print(check)

}