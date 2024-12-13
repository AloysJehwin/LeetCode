class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        Stack<Integer> stack=new Stack<>();
        int currentNumber=0;
        char operation='+';
        s=s.trim();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                currentNumber=currentNumber*10+(c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==s.length()-1){
                switch (operation) {
                    case '+':
                        stack.push(currentNumber);
                        break;
                    case '-':
                        stack.push(-currentNumber);
                        break;
                    case '*':
                        stack.push(stack.pop()*currentNumber);
                        break;
                    case '/':
                        stack.push(stack.pop()/currentNumber);
                }
                operation=c;
                currentNumber=0;
            }
        }
        int result=0;
        for(int num:stack){
            result+=num;
        }
        return result;
    }
}