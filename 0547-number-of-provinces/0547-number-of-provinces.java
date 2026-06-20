class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean [] visited=new boolean[isConnected.length];
                for(int i=0;i<isConnected.length;i++){
                  if(visited[i]==false){
                    count++;
                    dfs(isConnected,visited,i);
                  }
                }
        return count;
    }
    static void dfs(int[][] isConnected,boolean []visited,int c){
        int rows=isConnected.length;
        visited[c]=true;
      for(int j=0;j<isConnected.length;j++){
        if(visited[j]==false&&isConnected[c][j]==1){
            dfs(isConnected,visited,j);
        }
      }
    }
}