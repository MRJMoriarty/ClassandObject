package 其他类
/*
* 接口的函数默认为open
* 接口不能被实例化，只能实例化接口的实现类
* 方法一，单独写一个类来实例化接口
* 方法二，用匿名内部类
* */
interface onclickListener{
    fun onTouchEvent(type:String)
}//定义一个接口，管理触摸事件
fun didTouch(onclicklistener: onclickListener){
    onclicklistener.onTouchEvent("触摸事件")
}//如果有触摸事件，调用触摸事件函数
class didtouch: onclickListener {
    override fun onTouchEvent(type: String) {
        println("触摸事件发生")
    }
}//需要写一个类来实现接口

fun main() {
    val event = didtouch()//实例化类的对象
    didTouch(event)//用实例化的对象来调用以接口对象为参数的函数
//    didtouch().also {
//        didTouch(it)
//    }//用also方法，不用创建对象
//    didtouch().apply {
//        didTouch(this)
//    }//同also
    didTouch(object : onclickListener{
        override fun onTouchEvent(type: String) {
            println("触摸事件发生")
        }
    })
}//如果函数只用一次，没必要单独创建一个类，用匿名内部类实现接口方法即可