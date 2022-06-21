package medium.binary;

public class Numberof1Bits {
    public static void main(String[] args) {

    }
    public static int hammingWeight(int n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int result = 0;
        for (char c : chars){
            if (c =='1')
                result +=1;
        }
        return result;
    }
}
