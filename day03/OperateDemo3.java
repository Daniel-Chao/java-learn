class OperateDemo3
{
    public static void main(String[] args)
    {
        /*
        �Ƚ��������������Ϊ:true����false
         */
         System.out.println(3>2);   //ture
         System.out.println(3==2);   //false

         /*
         �߼�������������� ����Boolean���͵ı��ʽ

         &:��
         |:��

         &:���ŵ������ص㣺
           ��Ϊtrueʱ��Ϊ�棻
           ����Ϊ�٣�

         |�����ŵ������ص㣺
           ��һ��Ϊtrue��Ϊtrue��������Ϊ�١�
		
		^:���
		  ��ͬΪfalse����ͬΪtrue��

		����������

		&&��
		   �����&��˵��������ʱ�������������Ϊfalseʱ���ұ߲��������㡣
		   ��&����ʲô�����Ҫ�ж����ߵı��ʽ����١�

		||��
			��&&��ͬ���������Ϊtrueʱ�����ж��ұߵ�ֵ��
         */
         int x = 3;
         System.out.println(x>2&x<5);
         System.out.println(x<2|x>5);
    }
}