class Person
{

    private String name;  //��Ա������ʵ������
    private int age;
    static String country = "CN"; //��̬����������� 

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
      Person.method();  //��̬��������ֱ��ʹ����������

      Person p = new Person("Daniel",12);
      p.show(); //�Ǿ�̬����ֻ�ܴ�����������
    }
 
} 