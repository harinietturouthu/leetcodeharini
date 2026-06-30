class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
          adj.add(new ArrayList<>());
        }
        boolean[]  visited=new boolean[n+1]; 
        for(int i=0;i<times.length;i++){
            int source=times[i][0];
            int target=times[i][1];
            int time=times[i][2];
            adj.get(source).add(new int[]{target,time});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        
        dist[k]=0;
        while(!pq.isEmpty()){
            int[] node=pq.poll();
            int curr=node[0];
            int time=node[1];
            if(visited[curr]) continue;
            visited[curr]=true;
            for(int[] neigh:adj.get(curr)){
                int num=neigh[0];
                int timee=neigh[1];
                
                if(dist[curr]+timee<dist[num]){
                    dist[num]=dist[curr]+timee;
                    pq.offer(new int[]{num,dist[num]});
                }
            }
        }
         int max=0;
         for(int i=1;i<=n;i++){
            if(visited[i]==false){
                return -1;
            }
            max=Math.max(max,dist[i]);
           
         }
 return max;
    }
}