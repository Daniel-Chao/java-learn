/*
 
��̬�����
������ļ��ض�ִ�С����Ҿ�ִ��һ�Ρ�

���ã�
    ���ڸ����ʼ����

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

    {      //�������顣���Ը����ж����ʼ��
    //    System.err.println("Person run");
        cry();
    }

    Person()  //�Ǹ���Ӧ�Ķ����������Եĳ�ʼ��
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
     static //��̬����飬������г�ʼ��
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