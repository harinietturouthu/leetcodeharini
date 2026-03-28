class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder result=new StringBuilder();
       int count=0;
       for(int i=0;i<n;i++){
          if(s.charAt(i)=='('){
            if(count>0){
            result.append(s.charAt(i));
            }
            count++;
           }else if(s.charAt(i)==')'){
            
           count--;
            if(count>0){
             result.append(s.charAt(i));
           }
       }
       }
       return result.toString();
    }
}