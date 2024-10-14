// LC 3110 : Score of a String
public class LC3110 {
    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score = score + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "Dhara";

        System.out.println("Score of '" + s1 + "' = " + scoreOfString(s1));
        System.out.println("Score of '" + s2 + "' = " + scoreOfString(s2));

    }
}
