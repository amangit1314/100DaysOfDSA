public class MinNoOfSwapsToSortTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2};
        int n = arr.length;
        System.out.println(minSwaps(arr, n));
    }

    private static int minSwaps(int[] arr, int n) {
        int ans = 0;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                ans++;
                int init = arr[i];
                swap(arr, i, map.get(temp[i]));
                map.put(init, map.get(temp[i]));
                map.put(temp[i], i);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}