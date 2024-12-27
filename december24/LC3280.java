// LC 3280 : Convert Date to Binary
public class LC3280 {
    public String convertDateToBinary(String date) {
        String y = date.substring(0, 4);
        String m = date.substring(5, 7);
        String d = date.substring(8, 10);

        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));

        return sb.toString();
    }

    public static void main(String[] args) {
        LC3280 sol = new LC3280();
        String date = "2004-06-04";
        System.out.println(sol.convertDateToBinary(date));
    }
}