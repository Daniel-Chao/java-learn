//对两个整形变量的值进行互换（不使用第三方变量）
class Operatetest2
{
    public static void main(String[] args)
    {
        int a = 3,b = 5;
    //开发时使用
        // int c;
        // c = a;
        // a = b;
        // b = c;
    //这种方式，如果两个整数数值过大，会超过int范围，会强制转换。数据会变化。
        // a = a + b;
        // b = a - b;
        // a = a - b;

    //面试时，使用
        a = a ^ b;  //a=3^5
        b=a^b;     //b=(3^5)^5=3
        a=a^b;     //a=(3^5)^5^3=a
        System.out.println("a="+a+",b="+b);
    }
}