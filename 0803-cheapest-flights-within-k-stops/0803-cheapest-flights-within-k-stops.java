import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Step 1: Build adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // Step 2: Create queue for BFS (stores {node, cost})
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, 0});

        // Step 3: Initialize min cost array
        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[src] = 0;

        int stops = 0;

        // Step 4: BFS traversal up to k stops
        while (!q.isEmpty() && stops <= k) {
            int size = q.size();
            int[] temp = Arrays.copyOf(minCost, n); // copy current level costs

            while (size-- > 0) {
                int[] curr = q.poll();
                int node = curr[0];
                int cost = curr[1];

                for (int[] neighbour : adj.get(node)) {
                    int next = neighbour[0];
                    int price = neighbour[1];

                    if (cost + price < temp[next]) {
                        temp[next] = cost + price;
                        q.offer(new int[]{next, temp[next]});
                    }
                }
            }

            minCost = temp; // update for next level
            stops++;
        }

        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
    }
}
