public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newStr = "";
        char newChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (((int) str.charAt(i)) > 64 && (int) str.charAt(i) < 96) {
                newChar = (char) (((int) str.charAt(i)) + 32);
                newStr = newStr + newChar;
            } else {
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1.length() < str2.length()) {
            return false;
        }
        if (str2 == "") {
            return true;
        }
        int x = 0;
        boolean isContains = true;
        for (int i = 0; i < str1.length(); i++) {
            x = i;
            isContains = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) != str1.charAt(x)) {
                    isContains = false;
                    break;
                }
                x++;
            }
            if (isContains) {
                return true;
            }
        }
        return false;
    }
}
