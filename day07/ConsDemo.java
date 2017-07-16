class Person
{
    private String name ;
    private int age;

    //Person(){} //默认构造函数
    //定义一个构造函数
    Person()  //构造函数，而且是空参数
    {         //前面加void表示一般函数
         name="baby";
         age = 1;
        System.out.println("Person run");
    }

    Person(String name ,int age)
    {
        this.name = name;
        this.age = age;
        
    }

    public void setName(String name)
    {
        this.name  = name;
    }


    public void speak()
    {
        System.out.println(name +"\t"+age);
    }
}


/*
构造函数：构建创造对象时调用的函数。 作用可以给对象初始化。 
创建对象都必须通过构造函数初始化。

一个类中如果没有定义构造函数，那么该类中会有一个默认的空参数的构造函数、
如果在类中定义了指定的构造函数，那么类中默认的构造函数就没有了。

一般函数和构造函数的区别：
    构造函数：对象创建时，就会调用与之对应的够哦早函数，对对象进行初始化。
    一般函数：对象创建后，需要函数功能时才调用。

    构造函数：对象创建时，会调用只调用一次。
    一般函数：对象创建后，可以调用多次。

什么时候定义构造函数呢？
    在描述事物时，该事物已存在就具备一些内容，这些内容都定义在构造函数中。

    

*/
class ConsDemo
{
     public static void main(String[] args) 
    {
        
        Person p = new Person() ;  
        Person p1 = new Person("Daniel",23);
        p1.speak();
    }
}