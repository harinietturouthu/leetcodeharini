class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int[] ans1=new int[arr.length];
        int[] ans2=new int[arr.length];
        //pse
        int m=1000000007;
        for(int i=0;i<arr.length;i++){
           while(!s1.isEmpty()&&arr[s1.peek()]>=arr[i]){
            s1.pop();
           }
           if(s1.isEmpty()){
            ans1[i]=-1;
           }else{
            ans1[i]=s1.peek();
           }
           s1.push(i);
        }
        //nse
        for(int i=arr.length-1;i>=0;i--){
             while(!s2.isEmpty()&&arr[i]<arr[s2.peek()]){
                      s2.pop();
             }    
             if(s2.isEmpty()){
                ans2[i]=arr.length;
             }    else{
                ans2[i]=s2.peek();
             }
             s2.push(i);
             }
          long sum=0;
             for(int i=0;i<arr.length;i++){
                    int left=i-ans1[i];
                    int right=ans2[i]-i;
                     long k=(long)arr[i]*left*right;
                     sum=(sum+k)%m;
             
             }
             return (int)sum;
}
}