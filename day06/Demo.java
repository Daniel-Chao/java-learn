//�����������Ͳ�������
class Demo
{
    public static void main(String[] args)
    {
        int x = 3;
        show(x);
        System.out.println("x="+x);
    }
    public static void show(int x)
    {
        x=4;
    }
}

class Demo
{
    int x = 3;
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.x =9;
        show(d);  //�ĳ�show��new Demo()��
        System.out.println(d.x);  //4
        
    }


    //Ӧ���������Ͳ�������
    public static void show(Demo d) 
    {
        d.x = 4;
    }
}