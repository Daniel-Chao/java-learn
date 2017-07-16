/*
 人
 属性：
    年龄
方法：
    说话
 */
/*
private:私有，是一个权限修饰符。用于修饰成员。
            私有的内容只在本类中有效。
注意：私有仅仅是封装的一种体现而已。


*/

class Person
{
     private  int age;    //私有：只在本类中有效，其他类无法访问

    public void setAge(int a)  //setXxx、getXxx
    {
        age = a;
    }
    public int getAge()
    {
        return age;
    }

    /*
     public void age(int a)
     {  
         if(a>0 && a<130)
        {   
            age = a;
            Speak();
        }
        else
            System.out.println("error");
     }

     */
    void Speak()
    {
        System.out.println("age="+age);
    }

}

class PersonDemo
{
    public static void main(String[] args)
    {
        Person p = new Person();
    //    p.age = 40;
        p.age(30);
    //   p.Speak();
    }
}