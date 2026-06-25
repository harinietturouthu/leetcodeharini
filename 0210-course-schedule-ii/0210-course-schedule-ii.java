class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int[] edge=prerequisites[i];
            int first=edge[1];
            int second=edge[0];
            indegree[second]++;
            adj.get(first).add(second);
                    }
                    for(int i=0;i<numCourses;i++){
                        if(indegree[i]==0){
                            q.offer(i);
                        }
                    }
                    List<Integer> ans=new ArrayList<>();
                    while(!q.isEmpty()){
                        int node=q.poll();
                        ans.add(node);
                        for(int neighbours:adj.get(node)){
                            indegree[neighbours]--;
                            if(indegree[neighbours]==0){
                                q.offer(neighbours);
                            }
                        }
                    }
                    int [] result=new int[ans.size()];
                    for(int i=0;i<result.length;i++){
                        result[i]=ans.get(i);
                    }
                    if(ans.size()==numCourses){
                        return result;
                    }
                    return new int[0];
    }
}