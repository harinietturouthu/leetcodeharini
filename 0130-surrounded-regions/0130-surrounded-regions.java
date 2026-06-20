class Solution {
    public char[][] solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        //top
        for (int i = 0; i <cols; i++) {
            if(board[0][i]=='O'){
                 dfs(board,0,i);
                 }
        }
        //bottom
             for (int i = 0; i < cols; i++){    
            if(board[rows-1][i]=='O'){
                dfs(board,rows-1,i);
            }
             }
             //left
for (int j = 0; j < rows; j++) {
     if(board[j][0]=='O'){ 
        dfs(board,j,0);
     }
}
//right
     for (int j = 0; j < rows; j++){
            if(board[j][cols-1]=='O'){
                dfs(board,j,cols-1);
            }
}

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                  if(board[i][j]=='O'){
                   board[i][j]='X';
                }else if(board[i][j]=='#'){
                    board[i][j]='O';
                }
                }
            }
        
         return board; 
    }
static void dfs(char[][]board,int r,int c){
    int rows=board.length;
    int cols=board[0].length;
    if (r < 0 || c < 0 || r >= rows || c >= cols||board[r][c]!='O') {
    return;
} 
if(board[r][c]=='O'){
board[r][c]='#';
}
        dfs(board,r-1,c);
        dfs(board,r+1,c);
        dfs(board,r,c-1);
        dfs(board,r,c+1);
}
}
