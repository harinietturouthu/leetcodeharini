class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
       
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
       
        for(int i=0;i<arr1.length;i++){
            char ch=arr1[i];
            char ah=arr2[i];
            

        
        if(map1.containsKey(ah)){
            if(map1.get(ah)!=ch){
return false;
            }
            }
            if(map2.containsKey(ch)){
            if(map2.get(ch)!=ah){
return false;
            }
            }
                map1.put(ah,ch);
                map2.put(ch,ah);
            
        } 
        
        return true;
    }
}