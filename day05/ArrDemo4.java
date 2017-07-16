class ArrDemo4
{
    public static void  main(String[] args) {
        
        int[] arr =new int[] {78,234,567,12,456,768,4};
        int max = getMax(arr);
        System.out.println("最大值为="+max);

        printArr(arr);
       // selectSort(arr);
       //bubbleSort(arr);
       selectSort_2(arr);
        printArr(arr);

    }

    /*
    获取最大值
    思想：
    1.对数组的元素比较，并定义变量存放每次比较的较大的值。
    2.对数组元素进行遍历，和变量的值进行比较，如果较大就用变量保存较大的值。
    3.遍历结束，返回最大值
     */
    public static int getMax(int[] arr)
    {
        int max = arr[0];   //定义变量保存最大值
        for(int x=0;x<arr.length ;x++)
        {
            if(max < arr[x])
            {
                max = arr[x];
            }
        }
        return max;
    }

    /*选择排序
    思想：
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
    选择排序改进版
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
    打印数组
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
    冒泡排序：
     */
    public static void bubbleSort(int[] arr)
    {
        for(int x=0 ; x<arr.length-1 ; x++)
        {
            for(int y = 0 ;y <arr.length-1-x; y++) 
            {                       //内循环-1：为了避免角标越界。-x:为了让外循环增加一次，内循环参数与比较的元素个数递减。
                if(arr[y]>arr[y+1])  //例如：6个元素的数组，第一次比较需要5次，第二次需要4次……
                    swap(arr, y, y+1);
            }
        }
    } 

    /*
    冒泡排序2
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
    交换数组两个元素的位置
     */
    public static void swap(int[] arr,int a, int b)
    {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
    }
}