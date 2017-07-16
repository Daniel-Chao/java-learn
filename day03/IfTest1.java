class IfTest1
{
    public static void main(String[] args)
    {   
        /**
        需求：根据用户指定的具体数据，判断数据对应的星期。
        1-星期一 Monday

        思路：用户输入无法获取但是那只是具体数据的一种获取手段
             而我们对数据对应的星期进行打印就好

         */
        int week=8;

        if(week==1)
            System.out.println(week+"是星期一");
        else if(week==2)
             System.out.println(week+"是星期二");
        else if(week==3)
            System.out.println(week+"是星期三");
        else if(week==4)
            System.out.println(week+"是星期四");
        else if(week==5)
            System.out.println(week+"是星期五");
        else if(week==6)
            System.out.println(week+"是星期六");
        else if(week==7)
            System.out.println(week+"是星期日");
        else
             System.out.println(week+"没有对应的星期");

        


        System.out.println();
    }
}