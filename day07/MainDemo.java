/*
 public static void main(String[] args)

 1������������֮����
 2����jvm��ʶ��͵��á�

 public:����ΪȨ�ޱ��������ġ�
 static������Ҫ����ģ�ֱ���������������������ü��ɡ�
 void:������û�о���ķ���ֵ��
 main:�����������ǹؼ��֣�ֻ��һ��jvmʶ��Ĺ̶�������
 String[] args:�����������Ĳ����б���һ���������͵Ĳ���������Ԫ�ض����ַ������͡�




*/

class MainDemo
{
    public static void main(String[] args)  //new String[0]
    {
    //    System.out.println(args);  //[Ljava.lang.String;@15db9742
        System.out.println(args.length);  //0
        for(int x= 0; x<args.length;x++)
        {
            System.out.println(args[x]);
        }
        
    }
}