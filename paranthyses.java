package Basic_question;

import java.util.Stack;

public class paranthyses {

    public static boolean check(String str){

        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray() ){
            if(c == '{' || c == '[' || c == '(') st.push(c);

            else if(c == '}' || c == ']' || c == ')'){
                if(st.isEmpty()) return false;

                char top = st.pop();

                if((c == '}' && top != '{') || (c == ']' && top != '[') || c == ')' && top != ')') return false;

            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[{}]}";

        if(check(str)) System.out.println("valid");
        else System.out.println("invalid");

    }
}
