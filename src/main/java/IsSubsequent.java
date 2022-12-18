public class IsSubsequent {

//    TODO: Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//     A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
//     of the characters without disturbing the relative positions of the remaining characters.
//     (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    public static void main(String[] args) {
        String s = "abcde";
        String t = "ace";
        System.out.println(isSubsequent(s, t));
    }

    public static boolean isSubsequent(String s, String t){
        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++)
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
        return i == s.length();
    }
}
