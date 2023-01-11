public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void printLeadersBruteForce(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      boolean leader = true;

      //Checking whether arr[i] is greater than all the elements in its right side
      for (int j = i + 1; j < n; j++)
        if (arr[j] > arr[i]) {
          leader = false;
          break;
        }

      if (leader)
        System.out.print(arr[i] + " ");
    }
    System.out.print(arr[n - 1] + "\n");
  }

    public static void printLeadersEfficient(int[] arr, int n) {
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
        if (arr[i] > max) {
            max = arr[i];
            System.out.print(max + " ");
        }
        }
    }

}