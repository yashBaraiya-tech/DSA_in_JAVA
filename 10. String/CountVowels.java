public class CountVowels {
    public static void main(String[] args) {
        String str = "Yash Baraiya";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);

            if (s == 'A' || s == 'a' ||
                s == 'E' || s == 'e' ||
                s == 'I' || s == 'i' ||
                s == 'O' || s == 'o' ||
                s == 'U' || s == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}