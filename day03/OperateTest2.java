//���������α�����ֵ���л�������ʹ�õ�����������
class Operatetest2
{
    public static void main(String[] args)
    {
        int a = 3,b = 5;
    //����ʱʹ��
        // int c;
        // c = a;
        // a = b;
        // b = c;
    //���ַ�ʽ���������������ֵ���󣬻ᳬ��int��Χ����ǿ��ת�������ݻ�仯��
        // a = a + b;
        // b = a - b;
        // a = a - b;

    //����ʱ��ʹ��
        a = a ^ b;  //a=3^5
        b=a^b;     //b=(3^5)^5=3
        a=a^b;     //a=(3^5)^5^3=a
        System.out.println("a="+a+",b="+b);
    }
}