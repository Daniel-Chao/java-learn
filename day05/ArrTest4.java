class ArrTest4
{
    public static void main(String[] args)
    {
        String week = getWeek(6);
        System.out.println(week);
    }

    /*
    ʹ�ò������
    ���ڡ�

    String s = 'abc';
     */
    public static String getWeek(int num)
    {
        if(num >7 ||num <1)
            return "���������";
        String[] weeks = {"","����һ","���ڶ�","������","������","������","������","������"};
        return weeks[num];

    }
}