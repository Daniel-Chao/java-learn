class WhileTest2
{
    public static void main(String[] args)
    {
        /**
        ��ϰ��
        1~100֮�� 6�ı������ֵĴ�����

        ˼·��
        1.ÿ�β����6����ȡ���������ֵ��ͬ
        2.ÿ�γ��ֵ�6�ı�������ֵ��ͬ
        3.ÿ�β���ȡ�����ֵ�ڵ���
        4.ÿ���ֵ�6�ı�����ֵ���������м�1

        ���裺
        1.����һ�����������ڼ�¼ÿ�β����6ȡ�����ֵ
        2.����һ��������¼ÿ�γ���6�ı����Ĵ���
        3.����һ�����������洢��6ȡ��Ľ��
        4.ÿ�β����6ȡ���������ֵ����ѭ����1����
        5.��ÿ�γ��ֵ�6�ı�����ֵ����������������
         */

         int i = 1;    //��ʼ����1��ʼ����
         int count = 0;    //���ڼ�¼���ֵĴ���
         
         while(i<=100)
         {
            if(0 == i%6)
                count++;
        
            i++;
         }
         System.out.println("1~100֮����6�ı������ֵĴ���Ϊ"+count);
    }
}