import java.util.Stack;
// Valid Parentheses
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
*/
class Valid_Parentheses {
    public static boolean isValid(String s) {

        Stack<Character> S = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                S.push(c);
            } else if (!S.isEmpty()){
                if (c == ')' && S.peek() == '(' || c == '}' && S.peek() == '{' || c == ']' && S.peek() == '[') {
                    S.pop();
                }else{
                    return false;
                }
            } 
            else{
                return false;
            }

        }
        return S.isEmpty();//Check if the stack is empty or not

    }

    public static void main(String[] args) {
        String[] strs = new String[] {"()","()[]{}","(](]"};
        for(String str : strs){
            System.out.println(isValid(str));
        }

        
    }
}
