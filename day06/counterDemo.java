/*
 ����
    ��дһ���������࣬�����������ԣ�����a������b�ͽ��result��
    ����a��bΪint�ͣ�resultΪdouble���͡�
    ����������ӵ��4��������sum��sub��mult��div���ֱ�ʵ�ּӼ��˳���
 */
class counterDemo
{
    public static void main(String[] args)
    {
        counter c = new counter();
        int sum = c.getSum(3,4);
        int sub = c.getSub(3, 4);
        int mult = c.getMult(3, 4);
        double div = c.getDiv(3, 4);
        System.out.println("sum="+sum+","+"sub="+sub+","+"mult="+mult+","+"div="+div+",");
    }
}

class counter
{
    private int a;
    private int b;
    private double result;

    //�ӷ�
    public int getSum(int a , int b)
    {
        this.a = a;
        this.b = b;
        return a+b;
    }
    //����
    public int getSub(int a,int b)
    {
        this.a = a;
        this.b = b;
        return a-b;
    }
    //�˷�
    public int getMult(int a, int b)
    {
        this.a = a;
        this.b = b;
        return a*b;
    }
    //����
    public double getDiv(int a,int b )
    {
        this.a =a ;
        this.b = b;
        return (double)a/(double)b;
    }

}
