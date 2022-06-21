package medium.binary;

public class SumOfTwoInteger {
    public static void main(String[] args) {

    }
    public int getSum(int a, int b) {
        int xor = a^b;
        int and = (a&b) <<1;

        if (xor ==0){
            return and;
        }
        if (and ==0){
            return xor;
        }
        else
            return getSum(xor, and);
    }
}
