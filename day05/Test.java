import sun.security.util.Length;

class Test
{
    public static void main(String[] args)
    {   
        int[] arr = new int[]{8,12,32,48,56,86,93,124,234,6978};
     //   int[] arr = new int[]{21,43,243,4,46,23,765,38,97,9};
        printArr(arr);
        //bubbleSort(arr);
        //selectSort(arr);
        int index = halfSort(arr, 5);
        System.out.println("index="+index);
    }

    /*
    ��ӡ����
    */
    public static void printArr(int[] arr)
    {
        for(int x = 0;x<arr.length ; x++)
        {
            System.out.print("arr"+"["+x+"]="+arr[x]+"\t");
        }
        System.out.println();
    }

    /*
    ѡ������
    */
    public static void selectSort(int[] arr)
    {
        for(int x = 0 ; x<arr.length-1;x++)
        {
            for(int y = x+1; y <arr.length ;y++)
            {
                if(arr[x]>arr[y])
                    swap(arr, x, y);
            }
        }
    }
    //ѡ�������Ż���
    public static void selectSort_1(int[] arr)
    {
        for(int x=0 ; x<arr.length ;x++)
        {
            int num = arr[x] ;
            int index = x;
            for(int y = x+1 ; y <arr.length ; y++)
            {
                if(arr[x]>arr[y])
                {
                    num = arr[y];
                    index = y;
                }
            }
            if(index != x)
                swap(arr, x, index);
        }
    }

    /*
    ð������
    */
    public static void bubbleSort(int[] arr)
    {  
        for(int x = 0 ; x<arr.length-1; x++)
        {
            for( int y=0; y<arr.length-1-x;y++)
            {
                if(arr[y]>arr[y+1])
                    swap(arr, y, y+1);
            }
        }


    }


    /*
    ��������Ԫ������λ��
    */
    public static void swap(int[] arr,int a,int b)  //��ʾ��������arr��a��b�����Ǳ��������Ԫ�ص�λ��
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*
    ���ֲ���
     */
    public static int halfSort(int[] arr , int key )
    {
        int min = 0,max = arr.length-1;
        int mid = (max+min)/2;
        while(min <=max )
        {
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
            {
                max = mid-1;
                mid = (max+min)/2;
            }
            else 
            {
                min = mid +1;
                mid = (max+min)/2;
            }

        }
        return -mid-1;
    }



}