import java.util.Arrays;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "charecteristic";

        // method 1 (BruteForce attack)
        // int n = s.length();
        // int maxFreq = 0;
        // char ans = s.charAt(0);
        // for (int i = 0; i < n; i++) {
        // int freq = 1;
        // char ch = s.charAt(i);
        // for (int j = i + 1; j < n; j++) {
        // if (s.charAt(j) == ch)
        // freq++;
        // }
        // if (freq > maxFreq) {
        // maxFreq = freq;
        // ans = ch;
        // } else if (freq == maxFreq && ch < ans) {
        // ans = ch;
        // }
        // }
        // System.out.println(ans);

        // method 2 ()
        // int n = s.length();
        // int maxFreq = 0;
        // char ans = s.charAt(0);
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // int i = 0, j = 0;
        // while (j < n) {
        // if (arr[i] == arr[j])
        // j++;
        // else {
        // int freq = j - i;
        // if (freq > maxFreq) {
        // maxFreq = freq;
        // ans = arr[i];
        // }
        // i = j;
        // }
        // }
        // int freq = j - i;
        // if (freq > maxFreq) {
        // maxFreq = freq;
        // ans = arr[i];
        // }
        // System.out.println(ans);

        // method 3 (hashMap)
        int n = s.length();
        int[] freq = new int[26]; // sabme 0 hai
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 97);
            }
        }
        System.out.println(ans);

    }
}
