public class Insertsort {
    public static void sort(int[] arr)
    {
        int i, j;
        int n = arr.length;
        int target;
     
        //�ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
        //�������������1 - n-1
        for (i = 1; i < n; i++)
        {
            j = i;
            target = arr[i];
     
            while ( j>0&&target < arr[j - 1] ){
                arr[j]=arr[j-1];
                j--;
            }
     
            arr[j] = target;
        }
    }
    public static void main(String[] args){
        int[] a= {3,2,0,1,8};
        Insertsort s =new Insertsort();
        s.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
