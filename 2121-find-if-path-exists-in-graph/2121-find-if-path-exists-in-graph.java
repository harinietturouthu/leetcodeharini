class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int [] edge:edges){
            union(edge[0],edge[1],parent);
        
        }
        return find(source,parent)==find(destination,parent);
    }
    public void union(int n1,int n2,int[] parent){
        int r1=find(n1,parent);
        int r2=find(n2,parent);
        if(r1==r2)return;
        parent[r1]=r2;
    } 
    public int find(int node,int[] parent){
        if(node == parent[node])return node;
        parent[node]=find(parent[node],parent);
        return parent[node];
    }
}