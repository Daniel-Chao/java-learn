class IfTest2
{
    public static void main(String[] args)
    {
        /**
        需求：一年四季
            春季3 4 5 
            夏季6 7 8 
            秋季 9 10 11
            冬季：12 1 2
             根据用户输入的月份，给出对应的季节。
         */

        int month=5;

        if(month==3 || month==4 || month==5)
            System.out.println(month+"该月份是春季！");
        else if(month==5 || month==6 || month==7)
            System.out.println(month+"该月份是夏季！");
        else if(month==9 || month==10 || month==11)
            System.out.println(month+"该月份是秋季！");
        else if(month==12 || month==1 || month==2)
            System.out.println(month+"该月份是冬季！");
        else
            System.out.println(month+"没有该月份");



    }
}