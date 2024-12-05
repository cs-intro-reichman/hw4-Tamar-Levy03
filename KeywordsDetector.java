public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String[] words;
        for (int i = 0; i < sentences.length; i++) {
            words = wordSeparate(sentences[i]);
            for (int j = 0; j < words.length; j++) {
                for (int x = 0; x < keywords.length; x++) {
                    if (equals(lowerCase(words[j]), lowerCase(keywords[x]))) {
                        System.out.print(sentences[i]);
                        System.out.println();
                        break;
                    }
                }
            }

        }
    }

    /*
     * function that get a string and split him into individual words and return
     * them as an array of strings
     */
    public static String[] wordSeparate(String str) {
        int wordCounter = 0;
        int index = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCounter++;
            }
        }
        String[] wordSep = new String[wordCounter + 1];
        for (int j = 0; j < wordSep.length; j++) {
            word = "";
            while (index < str.length() && str.charAt(index) != ' ') {
                word += str.charAt(index);
                index++;
            }
            index++;
            wordSep[j] = word;
        }
        return wordSep;
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
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

    /* get 2 strings and returns if they equals */
    public static boolean equals(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
