class FunctionDemo3
{
    public static void main(String[] args)
    {
        draw(7,8);
	System.out.println("7��8������Ϊ"+getMax(7,8));
	print99();
        System.out.println("78����"+getLevel(78)+"�ȼ�");

    }
     /*
        �����������һ�����ܣ���һ�������ڿ���̨��
        ��ȷһ��������ܽ����ʲô��
            û�н������Ϊֱ�Ӵ�ӡ�ڿ���̨�ϣ�����̨����δ���ظ�������
            ��void��ʾ��
        ��ȷ�����������ʵ�ֵĹ����Ƿ���Ҫδ֪���ݲ��룿
            �У��к���û��ȷ��������������int��
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
    ������������һ�����ܣ��Ƚ���������ֵ�������Ƿ���ȡ�
    ��ȷһ��������ܽ����ʲô��
        �У�boolean��
    ��ȷ�����������ʵ�ֵĹ����Ƿ���Ҫδ֪���ݲ��룿
        �У���������int�� 
    */
    public static boolean equals(int a,int b)
    {
        // if(c==(a-b))
        //     return true;
        // else
        //     return false;
      //  return (a==b)?true:false;

        return a==b;    //��Ϊboolean����Ⱦ�Ϊtrue���Կ���

    }


    /*
    ����1������һ�����ܣ��Ƚ����������������Ǹ�����
    ��ȷһ��������ܽ����ʲô��
        �������������int
    ��ȷ�����������ʵ�ֵĹ����Ƿ���Ҫδ֪���ݲ��룿
        �У�����int�� 
    */
    public static int getMax(int a,int b)
    {
        // if((a-b>=0)
        //     return a;
        // return b;
        return (a>=b)?a:b;

        
    }
    /*
	���幦�ܣ���ӡ99�˷���
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
	���ݿ��Գɼ���ȡѧ��������Ӧ�ĵȼ�
	90~100	A
	80~89	B
	70~79	C
	60~69	D
	60����	E
	������ȼ����ַ���char
	������������int 

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