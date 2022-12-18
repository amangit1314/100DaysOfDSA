public class MaxTrainsForWhichStopageCanBeProvided {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int n = 6;
        int m = 2;

        System.out.println(maxTrains(arr, n, m));
    }

    private static int maxTrains(int[] arr, int n, int m) {
        if(arr.length == 0 || n == 0 && m == 0)
            return 0;

        Arrays.sort(arr);
        int count = 0;

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(list.size() == 0) {
                list.add(arr[i]);
                count++;
            }

            else {
                if(list.getFirst() <= arr[i]) {
                    list.removeFirst();
                    list.add(arr[i]);
                }

                else {
                    list.add(arr[i]);
                    count++;
                }
            }
        }

        return count;
    }    
}