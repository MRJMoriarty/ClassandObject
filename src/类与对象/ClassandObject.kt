package 类与对象

fun main() {
    val person = Person("小明",20)
    val animal = Animal("鼠王",10)
    println(person.name)
    //animal.name//这里是错误的，只有主构造函数里面的参数可以属性化，次构造函数的参数不能这么用
}
/*
* Kotlin里面构造函数有两种
* 1.主构造函数，放在类的头部
* 2.次构造函数，放在类的内部
* 主构造函数只能有一个，次构造函数可以有多个
* 次构造函数必须要显示调用主构造函数
* */
//类Person的主构造函数
open class Person(name:String,age:Int){
    //这就是主构造函数，直接与类连在一起
     val name: String = name
     var age: Int = age
}
//类Animal的次构造函数
class Animal(){
    constructor(name: String,age: Int):this(){
        //如果同时定义了主构造函数和次构造函数时，要先访问主构造函数
    }
}

