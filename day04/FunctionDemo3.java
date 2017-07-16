class FunctionDemo3
{
    public static void main(String[] args)
    {
        draw(7,8);
	System.out.println("7和8中最大的为"+getMax(7,8));
	print99();
        System.out.println("78分是"+getLevel(78)+"等级");

    }
     /*
        需求二：定义一个功能，画一个矩形在控制台。
        明确一：这个功能结果是什么？
            没有结果，因为直接打印在控制台上，控制台，并未返回给调用者
            用void表示。
        明确二：这个功能实现的过程是否需要未知内容参与？
            有，行和列没有确定，两个，整数int。
     */
    public static void draw(int row,int col)
    {
        for(int x=1;x<=row;x++)
        {
            for(int y=1;y<=col;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    /*
    需求三：定义一个功能，比较两个数的值，看其是否相等。
    明确一：这个功能结果是什么？
        有，boolean型
    明确二：这个功能实现的过程是否需要未知内容参与？
        有，两个整数int。 
    */
    public static boolean equals(int a,int b)
    {
        // if(c==(a-b))
        //     return true;
        // else
        //     return false;
      //  return (a==b)?true:false;

        return a==b;    //因为boolean型相等就为true所以可以

    }


    /*
    需求1：定义一个功能，比较两个整数中最大的那个数。
    明确一：这个功能结果是什么？
        结果是最大的整数int
    明确二：这个功能实现的过程是否需要未知内容参与？
        有，两个int。 
    */
    public static int getMax(int a,int b)
    {
        // if((a-b>=0)
        //     return a;
        // return b;
        return (a>=b)?a:b;

        
    }
    /*
	定义功能，打印99乘法表
     */
     public static void print99()
     {
	for(int x=1;x<=9;x++)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.print(y+"*"+x+"="+x*y+"\t");
		}
		System.out.println();
	}
     }
     /*
	根据考试成绩获取学生分数对应的等级
	90~100	A
	80~89	B
	70~79	C
	60~69	D
	60以下	E
	结果：等级，字符：char
	参数：分数，int 

     */	
	public static char getLevel(int total)
	{
		if(total>=90)
			return 'A';
		else if(total>=80)
			return 'B';
		else if(total>=70)
			return 'C';
		else if(total>=60)
			return 'D';
		else 
			return 'E';
	}

}