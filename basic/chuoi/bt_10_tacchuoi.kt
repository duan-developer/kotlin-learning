fun main(){
    var a="   tran nam     anh     "
    var b = a.trim().split("\\s+".toRegex())
    print(b)
}