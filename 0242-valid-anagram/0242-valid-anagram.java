class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;}
            char[] arr=s.toCharArray();
            char[] arr1=t.toCharArray();
            HashMap<Character,Integer> map1=new HashMap<>();
            HashMap<Character,Integer> map2=new HashMap<>();
            for(char ch:arr){
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            for(char ah:arr1){
                map2.put(ah,map2.getOrDefault(ah,0)+1);
            }
            if(map1.equals(map2)){
                return true;
            }
            return false;
        }
    }
