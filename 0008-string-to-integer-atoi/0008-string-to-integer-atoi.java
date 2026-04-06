class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){return 0;}
        String ans="";
    for(int i=0;i<s.length();i++){
        if((s.charAt(i)>='0'&&s.charAt(i)<='9')||(i==0&&(s.charAt(i)=='+'||s.charAt(i)=='-'))){
                   ans=ans+s.charAt(i);
        }else{
        break;
    }
    }
    if(ans.equals("")||ans.equals("+")||ans.equals("-")){
        return 0;
    }
    try {
            long num = Long.parseLong(ans);

            if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            return (int) num;
        } catch (Exception e) {
            if (ans.charAt(0) == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
   
    }
}