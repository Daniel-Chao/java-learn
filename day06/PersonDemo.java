/*
 ��
 ���ԣ�
    ����
������
    ˵��
 */
/*
private:˽�У���һ��Ȩ�����η����������γ�Ա��
            ˽�е�����ֻ�ڱ�������Ч��
ע�⣺˽�н����Ƿ�װ��һ�����ֶ��ѡ�


*/

class Person
{
     private  int age;    //˽�У�ֻ�ڱ�������Ч���������޷�����

    public void setAge(int a)  //setXxx��getXxx
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }

    /*
     public void age(int a)
     {  
         if(a>0 && a<130)
        {   
            age = a;
            Speak();
        }
        else
            System.out.println("error");
     }

     */
    void Speak()
    {
        System.out.println("age="+age);
    }

}

class PersonDemo
{
    public static void main(String[] args)
    {
        Person p = new Person();
    //    p.age = 40;
        p.age(30);
    //   p.Speak();
    }
}