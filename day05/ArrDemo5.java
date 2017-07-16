import java.util.Arrays;

/*
 �����⣺
 ����һ����������飬������������д洢һ��Ԫ�أ�����֤������黹������ġ�
 �Ǹ����Ԫ�صĴ洢�ĽǱ�Ϊ��λ�ȡ
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

        int index1 = Arrays.binarySearch(arr, 204); //������ڷ��ص��Ǿ���ĽǱ�λ�ã������ڷ��ص��ǣ�-����� -1��(-min -1)
        System.out.println("index1="+index1);
    }

    /*
    ���鳣�����ܣ���򵥵Ĳ���
     */

     public static int getIndex(int[] arr,int key)  //key��ʾҪ���ҵ���Ԫ��
     {
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x]==key)
            {
                return x;
            }
        }
        
        return -1;    //-1��ʾû�в��ҵ���������û�и�Ԫ��
     }

     /*
     ���ֲ���. 
     ֻ�ܲ�����������顣��������������������Ǳ귢���˱仯���Բ����ö��ֲ���
     ��������ѭ��������
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
        return mid; //������Ϊminʱ�������ɼ��������Ԫ��λ������ļ����±�λ�á�

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