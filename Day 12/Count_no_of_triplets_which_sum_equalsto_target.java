public class Count_no_of_triplets_which_sum_equalsto_target {
    public static void optimalWay(int[] arr) {
        int target = 9;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[j] + arr[k] == sum) {
                    count++;
                    j++;
                    k--;
                } else if (arr[j] + arr[k] < sum) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        int target = 9;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}