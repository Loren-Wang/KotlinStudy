package com.kotlintest.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvContent.addView(layoutInflater.inflate(R.layout.activity_test,null))
        tvTest.text = "lalalallalal"

        var person1 = Person1("TestNamePerson1",101)
        var person2 = Person2("TestNamePerson2",102)
        person2.name = "TestNamePerson2"
        person2.age = 102
        var person3 = Person3()
        person3.name = "TestNamePerson3"
        person3.age = 103
        var person4 = Person4()

        tvTestMessage1.text = person1.name + "---" + person1.age
        tvTestMessage2.text = person2.name + "---" + person2.age
        tvTestMessage3.text = person3.name + "---" + person3.age
        tvTestMessage4.text = person4.name + "---" + person4.age

    }
    //无内容无构造函数体
    class Person1(var name : String , var age : Int)

    //无内容有构造函数体
    class Person2(var name : String , var age: Int){
        init {//如果在此时初始化了参数，则在创建该对象的时候传递的值将不再起作用,只有在创建完该对象后在进行赋值才会生效
            name = "TestName"
            age = 100
        }
    }

    //有内容无构造函数体
    class Person3{
        lateinit var name : String//如果在调用前不初始化则会在调用时出现空指针问题
        var age : Int = 0
    }

    //有内容有构造体函数
    class Person4{
        lateinit var name : String//如果在调用钱不初始化则会在调用时出现空指针问题
        var age : Int = 104
        init {
            name = "TestNamePerson4"
        }
    }

}
