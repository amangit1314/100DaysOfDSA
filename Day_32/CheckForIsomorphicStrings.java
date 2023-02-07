public class CheckForIsomorphicStrings {
    public static void main(String[] args) {
        String firstString = '@#$';
        String secondString = '$#@';

       if(firstString.length() == secondString.length() && areIsomorphicStrings(firstString, secondString))
            System.out.println("True");

        else
            System.out.println("False");       
    }

    public static boolean areIsomorphicStrings(String firstString, String secondString) {
         HashMap<Character, Character> charCount = new HashMap<>();

         char char = 'a';

         for(int i = 0; i < firstString.length(); i++) {
            
            if(charCount.containsKey(firstString.charAt(i))){
                char = charCount.get(firstString.charAt(i));
                
                if(char != secondString.charAt(i))
                    return false;
            }

            else if(!charCount.containsValue(secondString.charAt(i))) {
                charCount.put(firstString.charAt(i), secondString.charAt(i));
            }

            return true;
         }
    }
}