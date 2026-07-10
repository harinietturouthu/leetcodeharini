class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        int k=2*nums.length;
        for(int i=k-1;i>=0;i--){
            int idx=i%nums.length;
            while(!s.isEmpty()&&nums[idx]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                ans[idx]=-1;
            }else{
            ans[idx]=s.peek();
            }
            s.push(nums[idx]);
        }
        return ans;
    }
}