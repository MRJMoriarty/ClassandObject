package 其他类
/*
* 嵌套类就是在类里面定义类
* 但这两个类其实不会产生任何联系，里面的类不能调用外面的类的参数
* 实际上这些类是相互独立的
* */
class Bank(var name:String){
    class Money(var money:Int){
    }
    class Card(val id:String){
    }
}
//这个嵌套类和下面三个类是等价的
//class Bank(var name:String){}
//class Money(var money:Int){}
//class Card(val id:String){}

/*
* 如果想要表示内部的类和外部的类有从属关系
* 则需要使用内部类，用关键字inner
* */

class Animal(kind:String) {
    var kind: String? = null

    inner class Dog() {
        var names = "Jim"
        var kind: String = "dog"
        fun showinformation() {
            println(kind)
            println(names)
        }
    }

    inner class Cat() {
        var names = "Tom"
        var kind: String = "cat"
        fun showinformation() {
            println(kind)
            println(names)
        }
    }
}

fun main() {
    var animal = Animal("null")
    animal.Dog().showinformation()
    animal.Cat().showinformation()
}