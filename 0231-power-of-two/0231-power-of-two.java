class Solution {
    public boolean isPowerOfTwo(int n) {
        String binary=" ";
        int count=0;
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        for(int i=0;i<binary.length();i++){
           if(binary.charAt(i)=='1'){
            count++; 
           }
        }
            if(count==1){
                return true; 
            }
             
        
        return false;
    }
}