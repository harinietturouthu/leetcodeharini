class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<long[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            int u=roads[i][0];
            int v=roads[i][1];
            int t=roads[i][2];
            adj.get(u).add(new long[]{v,t});
            adj.get(v).add(new long[]{u,t});
        }
        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
    long[] dist=new long[n];
        int mod=1000000007;
        Arrays.fill(dist,Long.MAX_VALUE);
        int src=0;
        dist[src]=0;
       int[] ways=new int[n];
       ways[0]=1;
          pq.offer(new long[]{src,dist[src]});
       
          while(!pq.isEmpty()){
            long[] node=pq.poll();
            int curr=(int)node[0];
            long wt=node[1];
            if(wt>dist[curr]){continue;}
            for(long[] neigh:adj.get(curr)){
                int m=(int)neigh[0];
                long k=neigh[1];
                if(dist[curr]+k<dist[m]){
                    dist[m]=k+dist[curr];
                    ways[m]=ways[curr];
                    pq.offer(new long[]{m,dist[m]});
                }else if(dist[curr]+k==dist[m]){
                    ways[m]=(ways[m]+ways[curr])%mod;
                }
            }
          }
          return ways[n-1];
}
          
    }
