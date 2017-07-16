import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/*
当成员变量和局部变量重名，可以用关键字this来区分。

this：代表对象。代表当前对象。
    this就是所在函数所属对象的引用。
    //简单说：哪个对象调用了this所在的函数，this就代表了哪个对象。

this也可以用于在构造函数中调用其他构造函数。
注意：只能定义在构造函数的第一行，因为初始化动作要先执行。
    */


class Person
{
    private String name ;
    private int age;

    Person()
    {  

         name="baby";
         age = 1;
        System.out.println("Person run");
    }

    Person(String name )
    {
        this();
        this.name = name;
        
    }
    Person(int age)
    {
        this.age = age;
        
    }
    Person(String name ,int age)
    {
        this(name);    //this调用必须用在构造函数的第一行
        this.age = age;
        
    }

    public void setName(String name)
    {
        this.name  = name;
    }


    public void speak()
    {
        System.out.println(this.name +"\t"+age);
    }

    /*
    判断是否是同龄人。
     */
    public boolean compare(Person p)
    {
        /*if(this.age ==p.age)
            return true;
        else 
            return false;
        */
        return this.age==p.age;
    }
    


}

class ThisDemo
{
     public static void main(String[] args) 
    {
        Person p1 = new Person("aa",30);
        Person p2 = new Person("bb",30);
        boolean  a= p1.compare(p2);
        System.out.println(a);
        // Person p = new Person("Daniel",23);
        // p.speak();
    }
}