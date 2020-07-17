/*
Given an expression string exp , write a program to examine whether the pairs and
        the orders of “{“ , ”}” , ”(“ , ”)” , ”[“ , ”]” are correct in exp.

        Example:

        Input: exp = “[()]{}{[()()]()}”
        Output: Balanced

        Input: exp = “[(])”
        Output: Not Balanced
*/

public class BalancedParanthesis {
    static class stack{
        int top=-1;
        char item[]=new char[300];
        void push(char x){
            if(top==299)
                System.out.println("stack full");
            else
                item[++top]=x;
        }
        char pop(){
            if(top==-1) {
                System.out.println("underflow");
                return '\0';
            }
            else {
                char element = item[top];
                top--;
                return element;
            }
        }
        boolean isEmpty(){
            return (top==-1)?true:false;
        }
    }
    static boolean isMatchingPair(char c1,char c2){
        if(c1=='(' && c2==')')
            return true;
        if(c1=='{' && c2=='}')
            return true;
        if(c1=='[' && c2==']')
            return true;
        else
            return false;

    }

    static boolean areParanthesisBalanced(char exp[]){
        stack st=new stack();
        for(int i=0;i<exp.length;i++){
            if (exp[i]=='('||exp[i]=='{'||exp[i]=='[')
                st.push(exp[i]);
            if(exp[i]==')'||exp[i]=='}'||exp[i]==']')
                if (st.isEmpty())
                    return false;
                else if (!isMatchingPair(st.pop(),exp[i]))
                    return false;
        }
        if(st.isEmpty()==true)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        char[] exp={'{',')','(','}'};
        if(areParanthesisBalanced(exp))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
