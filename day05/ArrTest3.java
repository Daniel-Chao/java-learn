/*
��ȡһ��������16���Ƶı�����ʽ
�����ơ��˽���
 */
class ArrTest3
{
    public static void main(String[] agrs)
    {
        toHex(60);
        toOctal(60);
        toBinary(60);

        System.out.println(Integer.toBinaryString(-6));
    }

    /*
    ����ת��
     */
    public static void trans(int num , int base , int offset) //numΪ��Ҫת�������֣�baseΪ��Ӧת�����Ƶ�ĩβ����16����Ϊ15��8����Ϊ7��2����Ϊ1
    {                                                         //offset��Ӧת�����Ƶ���λ���������磺16�����ƶ�4λ��8����Ϊ3λ��2����Ϊ1λ��
        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        char[] arr = new char[32];   
        int pos=arr.length;
        while(num != 0)
        {
            int temp  = num & base;
        
            arr[--pos] = chs[temp];
            num =num >>> offset ;
        }
        for(int x = pos ;x<arr.length;x++)
        {
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }
    /*
    10����ת��Ϊ16����
    */
    public static void toHex(int num )
    {
        trans(num, 15, 4);
    }
    /*
    10����ת��Ϊ8���� 

     */
      public static void toOctal(int num )
    {
        trans(num, 7, 3);
    }

    /*
     10����ת��Ϊ2����
     */
       public static void toBinary(int num )
    {
        trans(num, 1, 1);
    }

}