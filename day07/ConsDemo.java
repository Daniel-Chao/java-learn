class Person
{
    private String name ;
    private int age;

    //Person(){} //Ĭ�Ϲ��캯��
    //����һ�����캯��
    Person()  //���캯���������ǿղ���
    {         //ǰ���void��ʾһ�㺯��
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
���캯���������������ʱ���õĺ����� ���ÿ��Ը������ʼ���� 
�������󶼱���ͨ�����캯����ʼ����

һ���������û�ж��幹�캯������ô�����л���һ��Ĭ�ϵĿղ����Ĺ��캯����
��������ж�����ָ���Ĺ��캯������ô����Ĭ�ϵĹ��캯����û���ˡ�

һ�㺯���͹��캯��������
    ���캯�������󴴽�ʱ���ͻ������֮��Ӧ�Ĺ�Ŷ�纯�����Զ�����г�ʼ����
    һ�㺯�������󴴽�����Ҫ��������ʱ�ŵ��á�

    ���캯�������󴴽�ʱ�������ֻ����һ�Ρ�
    һ�㺯�������󴴽��󣬿��Ե��ö�Ρ�

ʲôʱ���幹�캯���أ�
    ����������ʱ���������Ѵ��ھ;߱�һЩ���ݣ���Щ���ݶ������ڹ��캯���С�

    

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