package easy.array;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0; // 최대 이익 (오늘 가격 - 최소 가격)
        for (int price : prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }

        return maxProfit;
    }
}
