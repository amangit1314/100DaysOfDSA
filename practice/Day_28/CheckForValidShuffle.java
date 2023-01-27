public class CheckForValidShuffle {
    // Leetocde valid anagram
    public static void main(String[] args) {
        String str1 = "XY";
        String str2 = "XY12";
        System.out.println(isValidShuffle(str1, str2));
    }

    public static boolean isValidShuffle(String s, String t) {
        int[] a = new int[26];
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            a[c - 'a']--;
        }
        for (int n : a) {
            if (n != 0) return false;
        }
        return true;
    }
}