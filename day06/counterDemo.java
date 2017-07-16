/*
 需求：
    编写一个计算器类，包含三个属性：数字a，数字b和结果result，
    其中a和b为int型，result为double类型。
    计算器对象拥有4个方法：sum、sub、mult和div，分别实现加减乘除。
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

    //加法
    public int getSum(int a , int b)
    {
        this.a = a;
        this.b = b;
        return a+b;
    }
    //减法
    public int getSub(int a,int b)
    {
        this.a = a;
        this.b = b;
        return a-b;
    }
    //乘法
    public int getMult(int a, int b)
    {
        this.a = a;
        this.b = b;
        return a*b;
    }
    //除法
    public double getDiv(int a,int b )
    {
        this.a =a ;
        this.b = b;
        return (double)a/(double)b;
    }

}
