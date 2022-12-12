class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            rev[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: ");
        for (int k = 0; k < rev.length; k++) {
            System.out.println(rev[k]);
        }
    }
}