import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Solution {
    public static int myAtoi(String str) {
        int result=0,temp;
        int ji = 1;
        str=str.trim();
        if(null == str|| str.length()<=0){
            return 0;
        }
        
        char sign;
        
        for(int i=str.length()-1;i>=0;i--){
            if (Character.isDigit(str.charAt(i))){ 
                temp = str.charAt(i)-'0';
                result = result + temp*ji;
                ji=ji*10;
            }
            
        }
        if(str.charAt(0)=='-'){
           result = -1*result;
        }
        
        return result;
    }
    public static void  main(String[] args){
        String str = " ";
        int i = myAtoi(str);
        System.out.println(i);
    }
      
}