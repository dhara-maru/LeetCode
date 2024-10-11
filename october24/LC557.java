// LC 557 : Reverse Word in a string III
public class LC557 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += reverseString(words[i]);
            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    private static String reverseString(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String sentence1 = "This is my String 1.";
        String result1 = reverseWords(sentence1);
        System.out.println(result1);

        String sentence2 = "EHehe look at my second string here!";
        String result2 = reverseWords(sentence2);
        System.out.println(result2);
    }
}
