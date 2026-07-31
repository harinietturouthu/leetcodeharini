class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for( int i=0;i<n;i++){
           int[] frq=new int[26];
           for(int j=i;j<n;j++){
            frq[s.charAt(j)-'a']++;
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if(frq[k]>0){
                max=Math.max(max,frq[k]);
                min=Math.min(min,frq[k]);
            }
           }
            sum=sum+(max-min);
        }
        }
        return sum;
    }
}