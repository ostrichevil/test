package demo.RanTest20180130.firstWork;


/**
 * li
 * s = "abc", t = "ahbgdc"  Return true.
 * s = "axc", t = "ahbgdc"  Return false.
 */
public class isSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int indexs=0;
        int indext=0;
        for (int i = indext; i < t.length(); i++) {
            if(s.charAt(indexs)==t.charAt(indext))
            {
                indexs++;
                if (indexs == s.length()) {
                    return true;
                }
            }
            indext++;
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf(isSubsequence("acd","abcefd")));
    }
}
