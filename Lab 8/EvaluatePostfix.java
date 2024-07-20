import java.util.Stack;
import java.util.Scanner;
class EvaluatePostfix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter postfix string to evaluate: ");
        String exp = sc.nextLine();
        int ans;
        ans = evalPostFix(exp);
        System.out.println(ans);
    }
    

    public static int evalPostFix(String polish){

        Stack<Integer> si = new Stack<>();
        int temp = 0;
        for(int i = 0;i<polish.length();i++){
            char ch = polish.charAt(i);
            

            //if character obtained is operand or number
            if(ch>='0' && ch<='9'){
                temp = (int)(ch-'0');
                si.push(temp);
            }
            
            //if character obtained is an operator
            else{
                int op1 = si.pop();
                int op2 = si.pop();

                switch(ch){
                    case '+': {
                        si.push(op2 + op1);
                        break;
                    }
                    case '-': {
                        si.push(op2 - op1);
                        break;
                    }
                    case '/': {
                        si.push(op2/op1);
                        break;
                    }
                    case '*': {
                        si.push(op2 * op1);
                        break;
                    }
                }
            }
        }
        return si.pop();
    }
}
