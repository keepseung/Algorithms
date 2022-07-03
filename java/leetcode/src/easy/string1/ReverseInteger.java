package easy.string1;

public class ReverseInteger {

    public static void main(String[] args) {
    }

    public int reverse(int x) {
        int result = 0;

        try {
            String[] reverse = String.valueOf(Math.abs(x)).split(""); // 1
            StringBuilder reverseStr = new StringBuilder(); // 2

            // 3
            if (x < 0)
                reverseStr.append("-");
            // 4
            for (int i = reverse.length - 1; i >= 0; i--)
                reverseStr.append(reverse[i]);
            // 5
            result = Integer.parseInt(reverseStr.toString());

            // 6
        } catch (NumberFormatException e) {
            result = 0;
        }

        return result;

    }
}
