class OperateDemo4
{
    public static void main(String[] args)
    {
        System.out.println(6&3);//结果为2，是通过转换为二进制后相与，结果为010，为2
        System.out.println(6|3);//结果为7.

	System.out.println(6^3); //异或也是转换为二进制，然后异或
				//异或同一个数两次，则得到的是它本身。

	System.out.println(3<<2);//相当于3*2^2=12.左移几位其实就是该数据乘以2的几次方。
	System.out.println(6>>1);//右移其实就是该数据除以2的几次幂。>>时高位出现的空位用原来高位的数据补足
				  //>>>右移表示无符号右移，高位空位补零
    }
}