class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int n:nums){
            if(n<10)
            sd=sd+n;
            else
            dd=dd+n;
        }
        if(sd==dd)
        return false;
        else 
        return true;
        }
    }
