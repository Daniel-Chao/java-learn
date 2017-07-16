/*
 
静态代码块
随着类的加载而执行。而且就执行一次。

作用：
    用于给类初始化。

 */
class StaticCode
{
    static int num ;
    static
    {  
        num = 10;
        System.out.println("hhhhhhaaha");
    }

    static void show()
    {
        System.out.println(num);
    }
}

class Person
{
    private String name;

    {      //构造代码块。可以给所有对象初始化
    //    System.err.println("Person run");
        cry();
    }

    Person()  //是给对应的对象进行针对性的初始化
    {
        name = "baby" ;
    //    cry();
    }
    Person(String name )
    {
        this.name = name;
    //     cry();
    }

    public void cry()
    {
        System.out.println("crycry");           
    }

    public void speak()
    {
        System.out.println("name="+this.name);
    }

    static void show()
    {
        System.out.println("show run");
    }
}
 class StaticCodeDemo
 {
     static //静态代码块，给类进行初始化
     {
         System.out.println("a");
     }
     public static void main(String[] args)
     {
        new StaticCode().show();
        new StaticCode().show();
        StaticCode.show();
        System.out.println("b");
        
        Person p1 = new Person();
        p1.speak();
        Person p2 = new Person("daniel");
        p2.speak();

        new Person();

    //    Person.show();
        

    }
 }