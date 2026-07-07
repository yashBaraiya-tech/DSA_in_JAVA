import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "races";
        String s2 = "cares";
        boolean isAnagram = true;

        char S1[] = s1.toCharArray();
        char S2[] = s2.toCharArray();
        Arrays.sort(S1);
        Arrays.sort(S2);

        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            for (int i = 0; i < S1.length; i++) {
                if (S1[i] != S2[i])
                    isAnagram = false;
            }
        }

        if (isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("not anagram");
    }
}
