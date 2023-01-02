public class TwoSum {
    public static Pair twoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            if(arr[i] + arr[j] == target)
                return new Pair(i, j);

            else if(arr[i] + arr[j] < target) 
                i++;

            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}