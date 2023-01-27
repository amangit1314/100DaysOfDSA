public class CheckIfItIsRotationOfOther {
    public static void main(String[] args) {
        String str1 = "Aman";
        String str3 = "namA";

        for(int i = 0; i < str1.length() - 1; i++) {
            String str2 = str1.substring(i + 1) + str1.substring(0, i + 1);
            if(str2.equals(str3)) {
                System.out.println("Rotation");
                break;
            } else {
                System.out.println("Not Rotation");
                break;
            }
        }
    }
}