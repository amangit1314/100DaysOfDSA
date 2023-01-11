public class RotateArrayByDPlaces {

    public static void reverse(int[] a, int s, int e) {
        while(s <= e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    public static void rightRotate(int[] a, int n, int k) {
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    } 

    public static void leftRotate(int[] a, int n, int k) {
        Reverse(a, 0, k - 1);
        Reverse(a, k, n - 1);
        Reverse(a, 0, n - 1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;

        if(direction == right)
            rightRotate(arr, n, k);

        else if (direction == left)
            leftRotate(arr, n, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}