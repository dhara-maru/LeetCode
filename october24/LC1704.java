// LC 1704 : Determine if String Halves Are Alike
class Solution {
    public boolean halvesAreAlike(String s) {
        // String s = "even";
        String firsthalf = "";
        String secondhalf = "";
        for (int i = 0; i < s.length() / 2; i++) {
            firsthalf += s.charAt(i);
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            secondhalf += s.charAt(i);
        }

        int Fvowels = 0;
        int Svowels = 0;
        for (int i = 0; i < firsthalf.length(); i++) {
            char r = firsthalf.charAt(i);
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' || r == 'A' || r == 'E' || r == 'I' || r == 'O'
                    || r == 'U') {
                Fvowels++;
            }
        }
        for (int i = 0; i < secondhalf.length(); i++) {
            char r = secondhalf.charAt(i);
            if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u' || r == 'A' || r == 'E' || r == 'I' || r == 'O'
                    || r == 'U') {
                Svowels++;
            }
        }

        boolean result = false;
        if (Fvowels == Svowels) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}