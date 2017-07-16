class ArrDemo4
{
    public static void  main(String[] args) {
        
        int[] arr =new int[] {78,234,567,12,456,768,4};
        int max = getMax(arr);
        System.out.println("���ֵΪ="+max);

        printArr(arr);
       // selectSort(arr);
       //bubbleSort(arr);
       selectSort_2(arr);
        printArr(arr);

    }

    /*
    ��ȡ���ֵ
    ˼�룺
    1.�������Ԫ�رȽϣ�������������ÿ�αȽϵĽϴ��ֵ��
    2.������Ԫ�ؽ��б������ͱ�����ֵ���бȽϣ�����ϴ���ñ�������ϴ��ֵ��
    3.�����������������ֵ
     */
    public static int getMax(int[] arr)
    {
        int max = arr[0];   //��������������ֵ
        for(int x=0;x<arr.length ;x++)
        {
            if(max < arr[x])
            {
                max = arr[x];
            }
        }
        return max;
    }

    /*ѡ������
    ˼�룺
    */  
    public static void selectSort(int[] arr) 
    {
        for(int x=0;x<arr.length-1 ;x++)
        {
            for(int y=x+1;y<arr.length;y++)
            {
                if(arr[x]>arr[y])
                    swap(arr, x, y);
            }
        }
    }
    /*
    ѡ������Ľ���
     */
    public static void selectSort_2(int[] arr)
    {
        for(int x = 0; x<arr.length-1 ; x++ )
        {
            int index=x;
            int min=arr[x];
            for(int y = x+1 ; y<arr.length ; y++ )
            {
                if(min>arr[y])
                {
                    min=arr[y];
                    index = y;
                }
            
            }
            if(index !=x )
                swap(arr, x, index);
        }
    }


    /*
    ��ӡ����
     */
    public static void printArr(int[] arr)
    {
        for(int x=0 ; x<arr.length ; x++)
        {
            System.out.print("arr"+"["+x+"]"+"="+arr[x]+"\t");
        }
        System.out.println();
    }

    /*
    ð������
     */
    public static void bubbleSort(int[] arr)
    {
        for(int x=0 ; x<arr.length-1 ; x++)
        {
            for(int y = 0 ;y <arr.length-1-x; y++) 
            {                       //��ѭ��-1��Ϊ�˱���Ǳ�Խ�硣-x:Ϊ������ѭ������һ�Σ���ѭ��������Ƚϵ�Ԫ�ظ����ݼ���
                if(arr[y]>arr[y+1])  //���磺6��Ԫ�ص����飬��һ�αȽ���Ҫ5�Σ��ڶ�����Ҫ4�Ρ���
                    swap(arr, y, y+1);
            }
        }
    } 

    /*
    ð������2
     */
    public static void bubbleSort2(int[] arr)
    {
        for(int x=arr.length ; x>0 ; x--)
        {
            for(int y = 0 ;y <x; y++) 
            {                      
                if(arr[y]>arr[y+1])  
                {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    } 

    /*
    ������������Ԫ�ص�λ��
     */
    public static void swap(int[] arr,int a, int b)
    {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }
}