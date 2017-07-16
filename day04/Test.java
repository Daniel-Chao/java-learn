class Test
{
    public static void main(String[] args)
    {
        boolean b = true;

        if(b=false)  
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");
    
        int x=2,y=3;
        switch(x)
        {
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }

        System.out.println("y="+y);
    }
}