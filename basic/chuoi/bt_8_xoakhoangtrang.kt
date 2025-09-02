fun main(){
    var a = "    tran van     anh    "
    var b = a.trim().split("\\s+".toRegex()).joinToString(" ")
    b.forEach { it ->print(it) }
}