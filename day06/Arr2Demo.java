class Arr2Demo
{
    public static void main(String[] args)
    {
        // int[] arr = new int[3];
        // System.out.println(arr);   //[I@15db9742  @�����ʵ������ @�ұ���ʵ��Ĺ�ϣֵ
        // int[][] arr = new int[3][2];

        // System.out.println(arr);      //[[I@15db9742
        // System.out.println(arr[0]);    //[I@6d06d69c
        // System.out.println(arr[0][0]);  //0


        // int[][] arr = new int[3][];
        // System.out.println(arr);         //[[I@15db9742
        // System.out.println(arr[0]);      //null
        // System.out.println(arr[0][0]);   //NullPointerException��null���������������NullPointerException


        int[][] arr = new int[3][2];

        System.out.println(arr.length);  //��ӡ��ά����ĳ��ȣ���ʵ����һά����ĸ���
        System.out.println(arr[1].length);  //��ӡ��ά�����нǱ�Ϊ1һά����ĳ���

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