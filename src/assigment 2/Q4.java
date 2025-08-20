public class Q4 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is  " + costPrice + " and Selling Price is  " + sellingPrice + "\n" +
                "The Profit is " + profit + " and the Profit Percentage is " + String.format("%.2f", profitPercentage) + "%");
    }
}

