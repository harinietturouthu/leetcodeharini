class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        int [] outdegree=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int neighbours:graph[i]){
                  outdegree[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        List<List<Integer>> reversegraph=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            reversegraph.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int neighbour:graph[i]){
                reversegraph.get(neighbour).add(i);
            }
        }
        for(int i=0;i<graph.length;i++){
            if(outdegree[i]==0){
                q.offer(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int neighbours:reversegraph.get(node)){
                outdegree[neighbours]--;
                if(outdegree[neighbours]==0){
                    q.offer(neighbours);
                }
            }
        }
        Collections.sort(ans);
        return ans;
        }   
}
