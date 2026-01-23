class Solution {
    public int singleNumber(int[] nums) {
      int n=nums.length;
      if(nums.length==1) return nums[0];
      for(int i=0;i<n;i++){
        boolean found=false;
        for(int j=0;j<n;j++){
            if(i!=j&&nums[i]==nums[j]){
                found=true;
                break;
            }
        }
        if(found==false)
        return nums[i];
             }  
             return -1;
    }
}