package easy.array;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int sum =0;
        for (int i =0; i<prices.length-1; i++){
            if (prices[i]<prices[i+1]){
                sum += prices[i+1]-prices[i];
            }
        }
        return sum;
    }
    public int reverse(int x) {

        // 절댓값을 문자열 배열로 바꿈
        // 문자열 배열을 Stringbuilder로 바꿈
        // 이때 음수인 경우 -를 추가함
        // Interger.parseInt로 문자열을 정수로 바꿔줌
        // 파싱에러가 나는 경우 0을 반환함
        try{
            String[] sourceStrArray = String.valueOf(Math.abs(x)).split("");
            StringBuilder reverse = new StringBuilder();

            if (x<0){
                reverse.append("-");
            }
            for (int i = 0; i < sourceStrArray.length; i++ ){
                reverse.append(sourceStrArray[i]);
            }

            return Integer.parseInt(reverse.toString());
        }catch(NumberFormatException e){
            return 0;
        }

    }
}
