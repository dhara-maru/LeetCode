//709. To Lower Case

public class LC709 {

    public String toLowerCase1(String s) {
        String answer = s.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        String s = "OCTOBER";
        LC709 sol = new LC709();
        System.out.println(sol.toLowerCase1(s));
    }
}
