class VarDemo2
{
    public static void main(String[] args)
    {
        // int x = 3;
        // byte b = 5;        //??byte????????????????int??4????????????????
        // x = x + b;
        // byte b = 3;   
        // b = (byte)(b+300);    //???????????byte???????????
        // System.out.println(b);

     
    //    System.out.println('a'+1);
        System.out.println((char)('a'+1));
        System.out.println('你'+0)；    //显示结果为数字，汉字’你‘转换成对应的数字。采用Unicode国际标准编码表。

        byte b = 4;         //4为int型，给byte型b赋值会丢失精度。
        byte b1 = 3;
        byte b2 = 7;

        b = b1 + b2;
        System.out.println(b);   //会发生错误，从int到byte会损失精度
    }
}