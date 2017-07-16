class Arr2Demo
{
    public static void main(String[] args)
    {
        // int[] arr = new int[3];
        // System.out.println(arr);   //[I@15db9742  @左边是实体类型 @右边是实体的哈希值
        // int[][] arr = new int[3][2];

        // System.out.println(arr);      //[[I@15db9742
        // System.out.println(arr[0]);    //[I@6d06d69c
        // System.out.println(arr[0][0]);  //0


        // int[][] arr = new int[3][];
        // System.out.println(arr);         //[[I@15db9742
        // System.out.println(arr[0]);      //null
        // System.out.println(arr[0][0]);   //NullPointerException：null的数组操作所以是NullPointerException


        int[][] arr = new int[3][2];

        System.out.println(arr.length);  //打印二维数组的长度，其实就是一维数组的个数
        System.out.println(arr[1].length);  //打印二维数组中角标为1一维数组的长度

        int[][] arr1 = {{3,17},{5,8,2,9},{4,1}};

        int sum = 0;
        for(int x=0; x<arr1.length;x++)
        {
            for(int y= 0; y<arr1[x].length;y++)
            {
               // System.out.println(arr[x][y]+"\t");
               sum = sum +arr1[x][y];
            }
        }

        System.out.println("sum="+sum);
    }

}