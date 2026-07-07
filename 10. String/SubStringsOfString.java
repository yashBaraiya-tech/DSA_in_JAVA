public class SubStringsOfString {
    public static void main(String[] args) {
        String s = "Jaishankar";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 5));

        // print all subString
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
