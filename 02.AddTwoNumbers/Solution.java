package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        
        
        int HAS_REMAINDER = 0;
        while(null != l1 && null != l2){
            if(HAS_REMAINDER >= 1){
                result.val = (l1.val + l2.val + 1);
                HAS_REMAINDER = 0;
            }else{
                result.val = l1.val + l2.val;
            }
            
            if(result.val/10 == 1){
                HAS_REMAINDER = 1;
                result.val = result.val-10;
            }
            //System.out.println(result.val);
            result = result.next;
            result = new ListNode(0);
            l1 = l1.next;
            l2 = l2.next;
            
        }
        return result;
    }
    public static void main(String[] args){
        ListNode res1 = new ListNode(9);
         res1.next = new ListNode(1);
        
        
        ListNode res2 = new ListNode(2);
        res2.next = new ListNode(9);
        Solution s = new Solution();
        s.addTwoNumbers(res1, res2);
        
    }

}
