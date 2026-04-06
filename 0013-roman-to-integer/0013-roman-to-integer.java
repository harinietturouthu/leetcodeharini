class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int k=0;
      for (int i=n-1;i>=0;i--){
        int current=value(s.charAt(i));
        if(i>0&&current>value(s.charAt(i-1))){
            k=k+current-value(s.charAt(i-1));
            i--;
        }else{
            k=k+current;
        }
      }
      return k;
    }
        public int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
}
}