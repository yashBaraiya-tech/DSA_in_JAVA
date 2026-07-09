public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        powerSet("", s, 0);
    }

    public static void powerSet(String ans, String s, int idx) {
        if (idx == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(idx);
        powerSet(ans, s, idx + 1);
        powerSet(ans + ch, s, idx + 1);
    }
}
