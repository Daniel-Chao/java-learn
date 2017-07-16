import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/*
����Ա�����;ֲ����������������ùؼ���this�����֡�

this��������󡣴���ǰ����
    this�������ں���������������á�
    //��˵���ĸ����������this���ڵĺ�����this�ʹ������ĸ�����

thisҲ���������ڹ��캯���е����������캯����
ע�⣺ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ������Ҫ��ִ�С�
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
        this(name);    //this���ñ������ڹ��캯���ĵ�һ��
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
    �ж��Ƿ���ͬ���ˡ�
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