package 类与对象
/*
* 多态的实现
* 如果一个类的子类有很多，而且在使用的时候要大量使用同一函数，可以使用多态节省代码
* */
fun main() {
    var dog = Dog()
    var animal = Animal1()
    AnimalSleep(animal)
    AnimalSleep(dog)
}
open class Animal1(){
   open fun Sleep(){
        println("我是父类，动物冬眠")
    }
}
class Dog():Animal1(){
    override fun Sleep() {
        println("我是子类，狗不冬眠")
    }
}
fun AnimalSleep(animal: Animal1){
    animal.Sleep()
}
/*
* 假如所有子类都要调用其Sleep函数
* 通常情况下就需要创建所有子类的对象
* 但是如果使用多态,就可以实现子类向父类转化
* 只需要把函数的参数设置为父类的对象
* 在想要调用子类的Sleep函数时，传子类对象即可
* */