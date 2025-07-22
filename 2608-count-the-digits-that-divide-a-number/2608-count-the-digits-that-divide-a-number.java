class Solution {
    public int countDigits(int num) {
        int c=0;
        int n=num;
        while(n>0){

        int x=n%10;
        if(num%x==0){
        c++;
        }
       n=n/10;
    }
    return c;
    }
}
    