

class Solution {
    public String multiply(String num1, String num2) {
int m=num1.length(),n=num2.length();
int[]pos=new int[m+n];
for(int i=m-1;i>=0;i--){
    int digit1=num1.charAt(i)-'0';
    for(int j=n-1;j>=0;j--){
        int digit2=num2.charAt(j)-'0';
        int mul=digit1*digit2;
        int p1=i+j;
        int p2=i+j+1;
        int sum=mul+pos[p2];
        pos[p1]+=sum/10;
        pos[p2]=sum%10;

    }
}
StringBuilder sb=new StringBuilder();
for(int p:pos){
    if(!(sb.length()==0&&p==0)){
        sb.append(p);
    }
}
return sb.length()==0?"0":sb.toString();
    }}
  
