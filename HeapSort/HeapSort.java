public class HeapSort {  
    public static void main(String[] args) {  
        int[] array = { 9, 6, 7, 8, 5, 11, 3, 2, 1, 0, -4, -2, 12 };  

        System.out.println("Before heap:");  
        ArrayUtils.printArray(array);  

        heapSort(array);  

        System.out.println("After heap sort:");  
        ArrayUtils.printArray(array);  
    }  

    public static void heapSort(int[] array) {  
           if(null == array||array.length <= 0){
               return;
            
           }
           buildMaxHeap(array);
           for(int i = array.length-1;i >0; i--){
               ArrayUtils.exchangeElements(array,0,i);
               maxHeap(array,i,0);
           }
    }  

    private static void buildMaxHeap(int[] array) {  
        int len = array.length;
        if(null == array || len <= 0){
            return; 
        }
        
        int half = (len-1)/2;
        for(int i = half; i >= 0; i--){
            maxHeap(array,len,i);
        }
        
    }  

    private static void maxHeap(int[] array, int heapSize, int index) {
        int left = index*2+1;
        int right = index*2+2;
        int largest=index;
        if(left<heapSize && array[left]>array[index]){
            largest = left;
        }
        if(right<heapSize && array[right] > array[largest]){
            largest = right;
        }
        if(largest != index){
            ArrayUtils.exchangeElements(array,index,largest);
            maxHeap(array,heapSize,largest);
        }
    }
          
}