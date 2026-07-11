class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        if(k==num.length()){return "0";}
        int m=0;
        char[] arr=num.toCharArray();
        for(int i=0;i<arr.length;i++){
        while(!s.isEmpty()&&num.charAt(i)<s.peek()&&k>0){
            s.pop();
            k--;
        }
            s.push(arr[i]);
        }
         while(k>0){
                s.pop();
                k--;
            }
        StringBuilder ans=new StringBuilder();
        while(!s.isEmpty()){
            ans.append(s.pop());
        }
        ans.reverse();
        while(ans.length()>0&&ans.charAt(0)=='0'){ans.deleteCharAt(0);}
        if(ans.length()==0){return "0";}
        return ans.toString();
    }
    }
