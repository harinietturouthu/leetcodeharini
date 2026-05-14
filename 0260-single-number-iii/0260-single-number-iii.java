class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
         int x=0;
            int y=0;
        int rightmostbit=xor&(-xor);
        for(int i=0;i<nums.length;i++){
        if((nums[i]&rightmostbit)==0){
            x=x^nums[i];
                  }
                  else{
                y=y^nums[i];
                  }
    }
    if(x>y){
        return new int[] {y,x};
        }
    return new int[]{x,y};
}
}