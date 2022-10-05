public class LongestStringPrefix {

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};
        longestCommonPrefix(strs);

    }
    //find the longest common part from the given massive of strings ("fl")
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;

    }
}
