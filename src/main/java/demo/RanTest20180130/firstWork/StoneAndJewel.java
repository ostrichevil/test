package demo.RanTest20180130.firstWork;

public class StoneAndJewel {

    public static int numJewelsInStones(String J, String S) {
        int num=0;
        char[] charJ =J.toCharArray();
        char[] charS =S.toCharArray();
        for(char s:charS)
        {
            for(char j:charJ)
            {
                if(s==j)
                {
                    num++;
                }
            }
        }
        return num;
    }

    public static int numJewelsInStonesSimple(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("abA","aAAbbb"));
        System.out.println(numJewelsInStonesSimple("aA","aAAbbb"));
    }
}
