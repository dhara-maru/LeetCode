
// LC 2942 : Find Words Containing Character
import java.util.ArrayList;
import java.util.List;

public class LC2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> containingwords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                containingwords.add(i);
            }
        }
        return containingwords;
    }

    public static void main(String[] args) {
        LC2942 sol = new LC2942();
        String[] words = { "leet", "code" };
        char x = 'e';
        System.out.println(sol.findWordsContaining(words, x));
    }
}
