class OperateDemo
{
    public static void main(String[] agrs)
    {
        //算术运算符。 + - * /  %(取余，模运算)  +（连接符）
        //++_和--
	// int x = 6370;
        // x = x / 1000*1000;

        System.out.println(-5%2);  //结果-1
        System.out.println(5%-2); //结果1 

        System.out.println(3+"2");   //结果为32直接把2连接在3后面
        System.out.println("5+5="+5+5);  //结果为5+5=55
        
        int a = 4, b = 5;
        System.out.println("a="+a+",b="+b);   //a=4,b=5

	short s = 3;
	s = s +4;    //强制转换丢失精度，把int强制转换成shrot型
	//s+4       //不会强制转换，不会丢失精度
	system.out.println("s="+s); //会发现错误 精度下降


	
    }
}