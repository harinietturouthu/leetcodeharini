class Solution {
    public int[] searchRange(int[] nums, int target) {
     int n=nums.length;
     int first=0;
     int last=0;
     if(n==1&&nums[0]==target){ return new int[]{0,0};}
     if(n==1&&nums[0]!=target){return new int[]{-1,-1};}
     for(int i=0;i<n;i++){
         if(nums[i]==target){
            first=i;
            last=i;
            while(last+1<n&&nums[last+1]==target){
                last=last+1;
              
            }
            return new int[]{first,last};
     }
     }
         return new int[]{-1,-1};
    }

    }  

