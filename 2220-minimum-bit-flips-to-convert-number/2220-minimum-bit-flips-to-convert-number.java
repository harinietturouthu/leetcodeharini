class Solution {
    public int minBitFlips(int start, int goal) {
        String binary1=Integer.toBinaryString(start);
        String binary2=Integer.toBinaryString(goal);
        int maxlength=Math.max(binary1.length(),binary2.length());
        while(binary1.length()<maxlength){
            binary1="0"+binary1;
        }
        while(binary2.length()<maxlength){
            binary2="0"+binary2;
        }
        int count=0;
       for(int i=0;i<maxlength;i++){
            if(binary1.charAt(i)!=binary2.charAt(i)){
               
                count++;
            }
        }
        return count;
    }
}