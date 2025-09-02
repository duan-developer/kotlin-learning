fun main(){
    // Viết hoa chữ cái đầu tiên của mỗi từ.
    var a = "    tran     Nam     anh   "
    var b = a.trim().split("\\s+".toRegex()).map{
        it.lowercase().replaceFirstChar { c ->c.uppercase() }
    }.joinToString(" ")
    print(b)


}
