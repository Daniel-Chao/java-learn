class SwitchTest
{
    public static void main(String[] args)
    {
        /**
        �û���������ݶ�Ӧ������
         */

        int week = 8;
        switch(week)
        {
            case 1:
                System.out.println(week+"��Ӧ��������һ");
                break;
            case 2:
                System.out.println(week+"��Ӧ�������ڶ�");
                break;
            case 3:
                System.out.println(week+"��Ӧ����������");
                break;
            case 4:
                System.out.println(week+"��Ӧ����������");
                break;
             case 5:
                System.out.println(week+"��Ӧ����������");
                break;
            case 6:
                System.out.println(week+"��Ӧ����������");
                break;
            case 7:
                System.out.println(week+"��Ӧ����������");
                break;
            default:
                System.out.println(week+"û�ж�Ӧ������");
                break;

        }  

        int month = 7 ;

        switch(month)
        {
            case 3:
            case 4:
            case 5:
                System.out.println(month+"��Ӧ�Ǵ���");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"��Ӧ���ļ�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"��Ӧ���＾");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month+"��Ӧ�Ƕ���");
                break;
            default:
                 System.out.println(month+"û�ж�Ӧ����");
                 break;
        }


    }
}