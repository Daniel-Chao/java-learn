import java.util.Arrays;

/*
 面试题：
 给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还有有序的。
 那个这个元素的存储的角标为如何获取
{8,10,54,64,87,104,476}

 */
class ArrDemo5
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{8,10,54,64,87,104,476};
        // int index = getIndex(arr, 10);
        // System.out.println("index="+index);
        int index = halfSearch_2(arr, 204);
        System.out.println("index="+index);

        int index1 = Arrays.binarySearch(arr, 204); //如果存在返回的是具体的角标位置，不存在返回的是（-插入点 -1）(-min -1)
        System.out.println("index1="+index1);
    }

    /*
    数组常见功能：最简单的查找
     */

     public static int getIndex(int[] arr,int key)  //key表示要查找到的元素
     {
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==key)
            {
                return x;
            }
        }
        
        return -1;    //-1表示没有查找到，该数组没有该元素
     }

     /*
     二分查找. 
     只能查找有序的数组。如果数组重新排序后因其角标发生了变化所以不能用二分查找
     两个控制循环的条件
    */
     public static int halfSearch(int[] arr,int key)
    {
        int min = 0; int max = arr.length-1;
        int mid = (min + max)/2;
        while(arr[mid]!=key)
        {
            if(key>arr[mid])
            {
                min = mid +1;
                mid = (min +max)/2;
            }    
              
            else if(key <arr[mid])
            {
                max = mid-1;
                mid = (min +max)/2;
            }    
              
            
            if(max<min)
                return -1;
            // mid = (min +max)/2;
        }
        return mid; //当返回为min时，则可完成加入的数组元素位于数组的几号下标位置。

    }

    public static int halfSearch_2(int[] arr, int key )
    {
        int min = 0,max = arr.length ;
        int mid = (min+max)/2;
        while(min<=max)
        {
            if(arr[mid]==key )
                return mid;
            if( arr[mid] < key )
            {
                min = mid +1;
                mid = (min +max)>>1; //mid=(min+max)>>1
            
            }
            if( arr[mid] >key )
            {
                max = mid -1;
                mid = (max +min)>>1 ;
            }
        }
        return min;
    }




}