/*
获取一个整数的16进制的表现形式
二进制、八进制
 */
class ArrTest2
{
    public static void main(String[] args)
    {
        toHex_2(60); //60十六进制3c
    }

    //1,2,3,4,5,6,7,8,9,  A, B, C, D, E, F
    //1,2,3,4,5,6,7,8,9,,10,11,12,13,14,15
   
    /*
    什么时候使用数组？
    如果数据出现了对应关系，而且对应关系的一方是有序的数字编号。并作为角标使用。
    这时候就必须要使用数组使用。

    就可以将这些数据都存储到数组中。
    根据运算的结果作为角标直接去查数组中对应的元素即可。
    
    这种方式：成为查表法
     */

    public static void toHex_2(int num )
    {
        if(num==0)
        {
            System.out.println("0");
            return ;
        }    
        //定义一个对应关系表
        char[] chs = {'0','1','2','3','4','5',
                    '6','7','8','9','A',
                    'B','C','D','E','F'};
        /*
        一会查表会查到机较多的数据
        数据一多就用数组存储起来，在进行操作。
        临时容器
         */

        char[] arr =new char[8];
        int pos = arr.length;

        while(num != 0)
        {
            int temp = num &15;
            arr[--pos] = chs[temp];
            num = num >>>4;
        }
        System.out.println("pos="+pos);
        for(int x=pos;x<arr.length;x++)
        {
            System.out.print(arr[x]+",");
        }
    }


    public static void toHex_1(int num)
    {
        char[] chs = {'0','1','2','3','4','5',
                    '6','7','8','9','A',
                    'B','C','D','E','F'};
        for(int x = 0;x<8; x++)
        {
            int temp = num &15;
            System.out.print(chs[temp]);
            num = num >>> 4;
        }
    }


    public static void toHex(int num)
    {
         for(int x=0 ;x<8;x++)
         {
             int temp =num &15;
             if(temp >9)
                System.out.print((char)(temp - 10+'A'));  //A是65
            else
                System.out.print(temp);
             
             num = num >>> 4;
         }
    }
}