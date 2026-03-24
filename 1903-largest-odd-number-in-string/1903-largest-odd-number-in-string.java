class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        char[] arr=num.toCharArray();
        int m=arr.length;
       
        if(num.charAt(m-1)%2!=0){
            return num;}
            for(int i=m-2;i>=0;i--){
         if(num.charAt(i)%2!=0){
            return num.substring(0,i+1);
        }
            }
    return "";
}
}