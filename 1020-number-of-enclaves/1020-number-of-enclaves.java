class Solution {
    public int numEnclaves(int[][] grid) {
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;
        //top
        for (int i = 0; i <cols; i++) {
            if(grid[0][i]==1){
                 dfs(grid,0,i);
                 }
        }
        //bottom
             for (int i = 0; i < cols; i++){    
            if(grid[rows-1][i]==1){
                dfs(grid,rows-1,i);
            }
             }
             //left
for (int j = 0; j < rows; j++) {
     if(grid[j][0]==1){ 
        dfs(grid,j,0);
     }
}
//right
     for (int j = 0; j < rows; j++){
            if(grid[j][cols-1]==1){
                dfs(grid,j,cols-1);
            }
}
for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]==1){
            count++;
        }
    }
}
return count;
    }
    static void dfs(int [][]grid,int r,int c){
    int rows=grid.length;
    int cols=grid[0].length;
    if (r < 0 || c < 0 || r >= rows || c >= cols||grid[r][c]!=1) {
    return;
} 
if(grid[r][c]==1){
grid[r][c]='#';
}
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
}
}