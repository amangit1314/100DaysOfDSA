public class DuplicatesInString {
    public static void main(String[] args) {
        String str = "Hello World";
        String duplicate = "";

        for(int i = 0; i < str.length() - 1; i++) {
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j))
                    duplicate += str.charAt(i);
            }
        }

        System.out.println(duplicate);
    }
}