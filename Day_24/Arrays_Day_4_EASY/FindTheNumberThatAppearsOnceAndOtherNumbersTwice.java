public class FindTheNumberThatAppearsOnceAndOtherNumbersTwice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        int n = arr.length;
        int singleNumber = singleNumber(arr, n); 
        //findNumberThatOccusTwice(arr, n);
        System.out.println(" Single Number: " + singleNumber);
    }

    public static int singleNumber(int[] arr, int n) {
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}