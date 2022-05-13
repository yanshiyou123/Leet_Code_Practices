/*
Roman to Integer:
Convert Roman Number to Integer in Java
*/
import java.util.HashMap;
class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        ht.put('M',1000);
        ht.put('D',500);
        ht.put('C',100);
        ht.put('L',50);
        ht.put('X',10);
        ht.put('V',5);
        ht.put('I',1);
        
        int sum = 0;
        for(int i = 0; i < s.length();i++){
            
                if( i > 0 && ht.get(s.charAt(i)) > ht.get(s.charAt(i-1))){
                    sum += ht.get(s.charAt(i))- ht.get(s.charAt(i - 1)) * 2;
                }
                else{
                    sum += ht.get(s.charAt(i));
                }
        
        }
        
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        romanToInt("XL");
    }

}
