class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0 )return 0;
        int n=nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i+1]-nums[i]==1){
                i++;
            }else if(nums[i+1]-nums[i]!=1){
                return nums[i]+1;
            }
        }
        return n;
    }
}