class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] indegree=new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int [] edge=prerequisites[i];
            int from=edge[1];
            int to=edge[0];
            indegree[to]++;
            adj.get(from).add(to);
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
            List<Integer> ans=new ArrayList<>();
            while(!q.isEmpty()){
                int node=q.poll();
                ans.add(node);
                for(int neighbour:adj.get(node)){
                    indegree[neighbour]--;
                    if(indegree[neighbour]==0){
                        q.offer(neighbour);
                    }
                }
            }
            if(ans.size()==numCourses){
                return true;
            }
            return false;

        }

    }
