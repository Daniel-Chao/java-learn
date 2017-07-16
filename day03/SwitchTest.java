class SwitchTest
{
    public static void main(String[] args)
    {
        /**
        用户输入的数据对应出星期
         */

        int week = 8;
        switch(week)
        {
            case 1:
                System.out.println(week+"对应的是星期一");
                break;
            case 2:
                System.out.println(week+"对应的是星期二");
                break;
            case 3:
                System.out.println(week+"对应的是星期三");
                break;
            case 4:
                System.out.println(week+"对应的是星期四");
                break;
             case 5:
                System.out.println(week+"对应的是星期五");
                break;
            case 6:
                System.out.println(week+"对应的是星期六");
                break;
            case 7:
                System.out.println(week+"对应的是星期日");
                break;
            default:
                System.out.println(week+"没有对应的星期");
                break;

        }  

        int month = 7 ;

        switch(month)
        {
            case 3:
            case 4:
            case 5:
                System.out.println(month+"对应是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"对应是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"对应是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month+"对应是冬季");
                break;
            default:
                 System.out.println(month+"没有对应季节");
                 break;
        }


    }
}