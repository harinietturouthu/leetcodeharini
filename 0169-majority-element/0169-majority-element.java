class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int k=nums.length/2;
    
        return nums[k];
    }
}