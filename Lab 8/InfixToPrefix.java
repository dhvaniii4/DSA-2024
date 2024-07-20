import java.util.Stack;
import java.util.Scanner;
class InfixToPrefix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix String: ");
        String infix = sc.nextLine();
        String revString = "";
        for(int i = infix.length()-1;i>=0;i--){
            if(infix.charAt(i)=='('){
                revString = revString + ')';
            }
            else if(infix.charAt(i)==')'){
                revString = revString + '(';
            }
            else{
                revString = revString + infix.charAt(i);
            }
        }    
        System.out.println("Reverse: "+revString);
        convertPrefix(revString);
    }
    public static int input_prec(char next){
        if(next=='+'||next=='-'){
            return 2;
        }
        else if(next=='*'||next=='/'){
            return 4;
        }
        else if(next=='^'){
            return 5;
        }
        else if(next>='a' && next<='z' ||next>='A' && next<='Z'){
            return 7;
        }
        else if(next=='('){
            return 9;
        }
        else if(next==')'){
            return 0;
        }
        else{
            return -1;
        }
    }
    
    public static int stack_prec(char next){
        if(next=='+'||next=='-')
            return 1;
        else if(next=='*'||next=='/'){
            return 3;
        }
        else if(next=='^'){
            return 6;
        }
        else if(next>='a' && next<='z' ||next>='A' && next<='Z'){
            return 8;
        }
        else if(next=='('){
            return 0;
        }
        else{
            return -1;
        }
    }
    
    public static int rank(char next){
        if(next=='+'||next=='-'||next=='*'||next=='/'||next=='^'){
            return -1;
        }
        else if(next>='a' && next<='z' ||next>='A' && next<='Z'){
            return 1;
        }
        else{
            return 0;
        }
    }
     
    public static void convertPrefix(String revString){
        Stack<Character> s = new Stack<>();
        int top = 0;
        s.push('(');
        top++;
        char next;
        String inString = revString + ")";
        char temp;
        String polish = "";
        int r = 0;
        for(int i=0;i<inString.length();i++)
        {
            next = inString.charAt(i);
            if(top<1){
            System.out.println("Invalid String!");
            return;
        }
        while(stack_prec(s.peek()) > input_prec(next) && top!=0){
            temp = s.pop();
            top--;
            polish = polish + temp;
            r = r + rank(temp);
            if(r<1){
                System.out.println("Invalid");
            }
        }   
        if(stack_prec(s.peek()) != input_prec(next)){
            s.push(next);
            top++;
        }
        else{
            s.pop();
            top--;
        }
    }
        if(top!=0 || r!= 1){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Nearly Postfix: "+polish);
        }
        String finalPref = "";
        for(int i = polish.length()-1;i>=0;i--){
            finalPref = finalPref + polish.charAt(i);
        }
        System.out.println("Prefix: "+finalPref);
    }
}