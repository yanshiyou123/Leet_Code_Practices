/*
Longest Common Prefix:
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

*/
import java.util.Arrays;
class LCP {
    public static String longestCommonPrefix(String[] strs) {
        
        String str = "";
        char c;
        if(strs.length == 0){
            return str;
        }
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int min = strs[0].length();
        
        for(int i = 0 ; i < min;i++){
            c = strs[0].charAt(i);
            for(int j = 1 ; j < strs.length; j++){
                if(strs[j].charAt(i) != c){
                   return str;
                } 
                
            }
            str += (c);
            
        }
        
        
        return str;
    }
    public static void main(String[] args) {
        String s1[] = {"flower","flow","flight"};
        String s2[] = {"dog","racecar","car"};
        String s3[] = {"fruit", "friend", "fraud"};
        String s4[] = {""};
        String s5[] = {"D"};
        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
        System.out.println(longestCommonPrefix(s3));
        System.out.println(longestCommonPrefix(s4));
        System.out.println(longestCommonPrefix(s5));
        
    }
}


