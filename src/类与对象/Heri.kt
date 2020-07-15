package 类与对象

fun main() {
    Son(180).showinformation()
}
open class Father(name:String,age:Int){
    //这就是主构造函数，直接与类连在一起
    val name: String = name
    var age: Int = age
    open fun information(){
        println("我是父类")
    }
}
class Son(var height:Int):Father("CC",20){
    override fun information(){
        println("我是子类")
    }//重写父类构造函数必须要添加override
    fun showinformation(){
        println(this.age)
        println(this.name)
        println(this.height)
        super.information()//调用父类的函数
        this.information()//调用自己的函数
    }
}