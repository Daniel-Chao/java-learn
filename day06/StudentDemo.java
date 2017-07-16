class StudentDemo
{
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s.toString());
    }



}
class Student
{
    private String num ;
    private String classs;
    private boolean sex =true;
    private int age;
    private String name = "haha";
    
    public String getNum()
    {
        return num;
    }

    public boolean getSex()
    {
        return sex;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;

    }

    public String toString()
    {
        String info = getName()+getSex();
        return info; 
    }
}

