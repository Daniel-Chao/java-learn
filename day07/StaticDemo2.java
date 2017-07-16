class Person
{

    private String name;  //成员变量，实例变量
    private int age;
    static String country = "CN"; //静态变量。类变量 

    public Person(String name ,int age)
    {
        this.name = name ;
        this.age = age;
    }
    public void show()
    {
        System.out.println(Person.country+"\t"+this.name+"\t"+this.age);
    }

    public static void method()
    {
        System.out.println(Person.country);
    }
}

class StaticDemo2
{
    int num = 6;
    public static void main(String[] args)
    {
      Person.method();  //静态方法可以直接使用类名调用

      Person p = new Person("Daniel",12);
      p.show(); //非静态所以只能创建对象后调用
    }
 
} 