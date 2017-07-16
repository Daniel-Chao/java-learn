class OperateDemo3
{
    public static void main(String[] args)
    {
        /*
        比较运算符的运算结果为:true或者false
         */
         System.out.println(3>2);   //ture
         System.out.println(3==2);   //false

         /*
         逻辑运算符用于连接 两个Boolean类型的表达式

         &:与
         |:或

         &:符号的运算特点：
           都为true时才为真；
           其他为假；

         |：符号的运算特点：
           有一个为true就为true，其他都为假。
		
		^:异或
		  不同为false，相同为true。

		！：非运算

		&&：
		   相比于&来说，在运算时，当左边运算结果为false时，右边不参与运算。
		   而&无论什么情况都要判断两边的表达式的真假。

		||：
			和&&相同，即当左边为true时，不判断右边的值。
         */
         int x = 3;
         System.out.println(x>2&x<5);
         System.out.println(x<2|x>5);
    }
}