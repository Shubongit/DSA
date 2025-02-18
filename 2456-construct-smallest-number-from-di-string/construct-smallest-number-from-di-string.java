class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();

        int num=1; //start from 1(smallest no. available)

        for(int i=0;i<=pattern.length();i++){
            stack.push(num++); //push the current no. into stack

            if(i==pattern.length() || pattern.charAt(i)=='I'){
                while(!stack.isEmpty()){ 
                    sb.append(stack.pop()); 
                }
            }
        }
        return sb.toString(); 
    }
}