//71 SE COMP A Wilfred Almeida

public class Question_3 {

    static int maximum_profit(int price[], int start, int end) {
        if (end <= start)
            return 0;

        int total_profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {

                    int current_profit = price[j] - price[i] + maximum_profit(price, start, i - 1)
                            + maximum_profit(price, j + 1, end);
                    total_profit = Math.max(total_profit, current_profit);
                }
            }
        }
        return total_profit;
    }

    public static void main(String[] args) {
        int costs[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = costs.length;

        System.out.print(maximum_profit(costs, 0, n - 1));
    }
}
