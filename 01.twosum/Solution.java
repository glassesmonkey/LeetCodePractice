package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            System.out.println("result1:"+result[1]+"  result0:"+result[0]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
    public  static void main(String[] args){
    	int[] nums = {1,3,5,6,7,9};
    	int target = 4;
    	Solution solution = new Solution();
    	solution.twoSum(nums, target);
    }
}
