public class MinCostOfRopes {
    public static boid calculateMinCost(int[] ropes) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ropes.length; i++) 
            pq.add(ropes[i]);

        int ans = 0;

        while(pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}