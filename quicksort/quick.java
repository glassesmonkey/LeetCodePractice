package com.compare.gc;
public class quick {
    public void quick_sort(int[] arrays, int lenght) {
        if (null == arrays || lenght < 1) {
            System.out.println("input error!");
            return;
        }
        
        _quick_sort(arrays, 0, lenght - 1);
    }

    public void _quick_sort(int[] arrays, int start, int end) {
        if(start>=end){
            return;
        }
        
        int i = start;
        int j = end;
        int value = arrays[i];
       int temp = 0;
        while (i != j & i<j) {
            while(arrays[j] >= value & i<j){
                j--;
            }
            while(arrays[i] <= value & i<j){
                i++;
            }
            if(i<j){
                temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
           
        }
       
        arrays[start] = arrays[i];
        arrays[i] = value;
        snp(arrays);
        _quick_sort(arrays, start, j-1);
        _quick_sort(arrays, i+1, end);
        
    }

    public void snp(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }

    private void swap(int[] arrays, int i, int j) {
        int temp;
        temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }

    public static void main(String args[]) {
        
        quick q = new quick();
        int[] a = { 49, 38, 65,12,45,5 };
        q.quick_sort(a,6);
    } 

}