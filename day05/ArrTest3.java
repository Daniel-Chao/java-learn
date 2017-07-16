/*
获取一个整数的16进制的表现形式
二进制、八进制
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
    进制转化
     */
    public static void trans(int num , int base , int offset) //num为想要转化的数字，base为对应转换进制的末尾处理16进制为15、8进制为7、2进制为1
    {                                                         //offset对应转换进制的移位操作。例如：16进制移动4位、8进制为3位、2进制为1位。
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
    10进制转化为16进制
    */
    public static void toHex(int num )
    {
        trans(num, 15, 4);
    }
    /*
    10进制转化为8进制 

     */
      public static void toOctal(int num )
    {
        trans(num, 7, 3);
    }

    /*
     10进制转化为2进制
     */
       public static void toBinary(int num )
    {
        trans(num, 1, 1);
    }

}