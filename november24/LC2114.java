// LC 2114 : Maximum Number of Words Found in Sentences
public class LC2114 {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            int wordCount = sentence.split(" ").length;

            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        return maxWords;
    }

    public static void main(String[] args) {
        LC2114 sol = new LC2114();
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        System.out.println(sol.mostWordsFound(sentences));
    }

}