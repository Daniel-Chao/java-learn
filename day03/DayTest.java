class DayTest
{
    public static void main(String[] args)
    {
        /*
        3000米长的绳子，每天减一半，问，需要多少天，绳子会小于5米？
        思路：
        1.绳子长度每天在变化，所以绳子长度是一个变量，变量初始值为3000m
        2.每天减一半，天数也在变化，所以天数也是一个变量
        3.每天绳长度减一半，就算一天。很像计数器思想
        4.天数递增，减半就重复，所以是循环结构
        5.直到绳子长度小于5m也是一个循环结构
        */

      int day=0,a = 3000;
 /*     for(;;day++)
        {   
	    a=a/2;
	    if(a<5)
		break;
            
        }
        System.out.println("需要"+day+"天，绳子长度为"+a+"米");
*/
	
	while(a>=5)
	{
		a = a/2;
		day++;
	}
	System.out.println("需要"+day+"天，绳子长度为"+a+"米");


	//将这个运算过程画出来。 你从这个代码运算规律中发现了什么？总结了什么思想？


		for(int x=0; x<3; x++)
		{
			for(int y=0; y<5; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }
}