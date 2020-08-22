import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        List<String> list = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(list);
        return String.join(" ",list);
    }
    /*
    public String reverseWords(String s) {
        String[] strings = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i].trim() + " ");
        }
        return sb.toString().trim();
    }*/
}