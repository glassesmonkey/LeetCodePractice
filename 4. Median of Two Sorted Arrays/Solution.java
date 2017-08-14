public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> array = new ArrayList<>();
        double sum;
        for(int i=0; i<nums1.length; i++){
            array.add(nums1[i]);
        }
        for(int j=0; j < nums2.length; j++){
            for(int i=0; i < nums1.length; i++){
                if(nums2[j] < array.get(i)){
                    array.add(i, nums2[j]);
                }
            }
        }
       
        if((array.size()%2) == 0){
             sum=(array.get((array.size()/2))+array.get((array.size()/2)-1))/2;
        }else{
             sum = array.get((array.size()/2));
        }
        return sum;
    }
}