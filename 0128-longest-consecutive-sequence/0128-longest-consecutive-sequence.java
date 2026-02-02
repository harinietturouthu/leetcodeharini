class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        Arrays.sort(nums);

        int count = 1;        // current streak length
        int maxcount = 1;     // longest streak

        int i = 0;
        int j = 1;

        while(j < n){
            if(nums[j] - nums[i] == 0){   // duplicate
                i++;
                j++;
            }
            else if(nums[j] - nums[i] == 1){ // consecutive
                count++;
                maxcount = Math.max(maxcount, count);
                i++;
                j++;
            }
            else{       // not consecutive → reset
                count = 1;
                i++;
                j++;
            }
        }

        return maxcount;
    }
}
