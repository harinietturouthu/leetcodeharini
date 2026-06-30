class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        // adjacency list
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // build graph
        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0];
            int to = flights[i][1];
            int price = flights[i][2];

            adj.get(from).add(new int[]{to, price});
        }

        // min heap -> sort by cost
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // dist[node][flightsUsed]
        int[][] dist = new int[n][k + 2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        // start
        dist[src][0] = 0;
        pq.offer(new int[]{src, 0, 0});

        while (!pq.isEmpty()) {

            int[] node = pq.poll();

            int curr = node[0];
            int cost = node[1];
            int flightsused = node[2];

            // destination found
            if (curr == dst) {
                return cost;
            }

            // cannot take more flights
            if (flightsused == k + 1) {
                continue;
            }

            // explore neighbors
            for (int[] h : adj.get(curr)) {

                int nextNode = h[0];
                int wt = h[1];

                int newCost = cost + wt;

                // better cost for same node + same flights count
                if (newCost < dist[nextNode][flightsused + 1]) {

                    dist[nextNode][flightsused + 1] = newCost;

                    pq.offer(new int[]{
                            nextNode,
                            newCost,
                            flightsused + 1
                    });
                }
            }
        }

        return -1;
    }
}