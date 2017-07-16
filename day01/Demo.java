/*
需求：练习一个hello world程序
思路：
1、定义一个类，因为java程序都定义在类中，java程序都是以类的形式存在的，类的形式其实即使一个字节码文件的最终体现。
2、定义一个主函数，为了让该类可以独立运行。
3、因为演示hello world，在控制台上看到该字样，所以需要输出语句完成。

步骤：
1、用class类关键字来完成类的定义，并起一个阅读性强的类名。
2、主函数：public static void main(String[] args)这是固定格式的，jvm认识的。
3、使用输出语句：System.out.println("hello world!");
 */
class Demo 
{    //定义一个主函数，为了保证程序的独立运行。
	public static void main(String[] args)
	{
		System.out.println("hello world");	  //这是输出语句，用于将括号中的内容打印在控制台上，ln表示在输出语句后换行。
	}
}