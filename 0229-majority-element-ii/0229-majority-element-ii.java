class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int key:map.keySet()){
        if(map.get(key)>n/3){
            ans.add(key);
        }
    }
    return ans;
}
}