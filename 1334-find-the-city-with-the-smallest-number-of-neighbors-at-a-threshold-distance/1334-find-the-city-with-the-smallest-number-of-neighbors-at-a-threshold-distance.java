class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
       List<List<int[]>> adj=new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++){
        int from=edges[i][0];
        int to=edges[i][1];
        int weight=edges[i][2];
        adj.get(from).add(new int[]{to,weight});
        adj.get(to).add(new int[]{from,weight});
       }
       int[][] dist=new int[n][n];
       for(int i=0;i<n;i++){
       Arrays.fill(dist[i],Integer.MAX_VALUE);}
       for(int i=0;i<n;i++){
        dist[i][i]=0;
       }
    for(int i=0;i<adj.size();i++){
        for(int[] ne:adj.get(i)){
            int h=ne[0];
            int t=ne[1];
            dist[i][h]=t;
                    }
    }
       for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){ 
                    if(dist[i][k]!=Integer.MAX_VALUE&&dist[j][k]!=Integer.MAX_VALUE){
dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);}
    }
}
       }
       int [] a=new int[n];
       for(int i=0;i<dist.length;i++){
        for(int j=0;j<dist[0].length;j++){
            if(i!=j&&dist[i][j]<=distanceThreshold){
                a[i]++;
            }

        }
       }
       List<Integer> o=new ArrayList<>();
       int min=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++){
          min=Math.min(min,a[i]);
       }      
       for(int i=0;i<a.length;i++){
        if(a[i]==min){
            o.add(i);
        }
       }
      
        return o.get(o.size()-1);
      
    }
}
