class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]<nums[(i+1)%n]){
                i++;
            }else{
                return nums[(i+1)%n];
            }
            }
            return nums[0];
        }
    }
    
