class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int INF = 1000000000;

        // Step 1: create distance matrix
        int[][] dist = new int[n][n];

        // Step 2: initialize matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                if(i == j){
                    dist[i][j] = 0;
                }
                else{
                    dist[i][j] = INF;
                }
            }
        }

        // Step 3: fill edges
        for(int i = 0; i < edges.length; i++){

            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];

            dist[u][v] = wt;
            dist[v][u] = wt;
        }

        // Step 4: Floyd Warshall
        for(int k = 0; k < n; k++){

            for(int i = 0; i < n; i++){

                for(int j = 0; j < n; j++){

                    if(dist[i][k] != INF && dist[k][j] != INF){

                        dist[i][j] = Math.min(
                                dist[i][j],
                                dist[i][k] + dist[k][j]
                        );
                    }
                }
            }
        }

        // Step 5: find city with smallest reachable cities
        int minCount = Integer.MAX_VALUE;
        int ans = -1;

        for(int i = 0; i < n; i++){

            int count = 0;

            for(int j = 0; j < n; j++){

                if(i != j && dist[i][j] <= distanceThreshold){
                    count++;
                }
            }

            // tie → choose greater city number
            if(count <= minCount){
                minCount = count;
                ans = i;
            }
        }

        return ans; 
    }
}