// LC 771 : Jewels and Stones
class LC771 {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        LC771 sol = new LC771();
        System.out.println("Jewels in stones : " + sol.numJewelsInStones("aA", "aAAAbbbbbb"));

    }

}