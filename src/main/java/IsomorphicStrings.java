import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String b = "bar";
        System.out.println(isIsomorphic(s, b));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i))){
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
