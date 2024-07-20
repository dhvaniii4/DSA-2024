import java.util.*;

class EvaluatePrefix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to convert into prefix: ");
        String str = sc.nextLine();

        String revString = "";
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('){
                revString = revString + ")";
            }
            else if(str.charAt(i)==')'){
                revString = revString + "(";
            }
            else{
                revString = revString + str.charAt(i);
            }
        }
        System.out.println("Reverse Of Polish: "+revString);
        int ans;
        ans = evalPrefix(revString);
        System.out.println("Answer is: "+ans);
    }

    public static int evalPrefix(String polish){
        Stack<Integer> si = new Stack<>();
        int temp = 0;
        for(int i = 0;i<polish.length();i++){
            char ch = polish.charAt(i);

            if(ch>='0' && ch<='9'){
                temp = (int)(ch-'0');
                si.push(temp);
            }
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
                    case '*': {
                        si.push(op2 * op1);
                        break;
                    }
                    case '/': {
                        si.push(op2 / op1);
                        break;
                    }
                }
            }
        }
        return si.pop();
    }
}