class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        Queue<int[]> q=new LinkedList();
        if(grid[0][0]!=0){return -1;}
        if(grid[n-1][n-1]!=0){return -1;}
    int [] dr={-1,-1,-1,0,0,1,1,1};
    int [] dc={-1,0,1,-1,1,-1,0,1};
        q.offer(new int[]{0,0,1});
        grid[0][0]=1;
        while(!q.isEmpty()){
            int[] node=q.poll();
            int r=node[0];
            int c=node[1];
            int dist=node[2];
            if(r==n-1&&c==n-1){return dist;}
        for(int i=0;i<8;i++){
            int newrow=r+dr[i];
            int newcol=c+dc[i];
            if(newrow >= 0 && newrow < n &&
   newcol >= 0 && newcol < n)
            if(grid[newrow][newcol]==0){
                grid[newrow][newcol]=1;
                q.offer(new int[]{newrow,newcol,dist+1});
            }
        }
        }
        return -1;
    }
}