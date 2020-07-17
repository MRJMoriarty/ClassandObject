package 其他类

fun main() {
    User(1,"CC")
}
/*
* 数据类的主构造函数必须要有至少一个参数
* 参数必须要有var或者val修饰
* 如果希望外部能修改参数，使用var
* 如果不希望外部修改，使用val
* 数据类不能使用open inner abstract修饰
* */
data class User(var id : Int,var name :String){}
