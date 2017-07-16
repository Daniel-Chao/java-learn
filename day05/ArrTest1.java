/*
给定一个数组，对其进行反转。

{3,1,6,5,8,2} --> 
{2,8,5,6,1,3};

其实就是头尾元素的位置置换。

*/
class ArrTest1
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,1,6,5,8,2};
        printArr(arr);
        for(int start=0 , end =arr.length-1 ; start <end  ; start++ ,end--)
        {
                swap(arr, start, end);
        }
        printArr(arr);

    }
    public static void printArr(int[] arr)
    {
        for(int x=0; x<arr.length; x++)
        {
            System.out.print("arr"+"["+x+"]="+arr[x]+"\t");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int a, int b )
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    
}