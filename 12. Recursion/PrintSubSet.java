import java.util.ArrayList;
import java.util.List;

public class PrintSubSet {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subset("", s, 0, list);
        System.out.println(list);
    }

    public static void subset(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subset(ans, s, idx + 1, list);
        subset(ans + ch, s, idx + 1, list);
    }
}
