class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       int  n=s.length();
       StringBuilder result=new StringBuilder();
        int i=n-1;
        int j=n-1;
        while(i>=0){
            if(s.charAt(i)==' '&& i< j){
                result.append(s.substring(i+1,j+1));
                result.append(" ");
                j=i-1;
            }
            while(j >= 0 && s.charAt(j) == ' '){
                    j--;
                }

            i--;
        }
        result.append(s.substring(0,j+1));
        return result.toString().trim();
        
}
}