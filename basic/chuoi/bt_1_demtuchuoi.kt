fun main(){
    var a = "   Xin    chao moi nguoi"
    var b = a.trim().split("\\s+".toRegex())
    println(b.size)
}