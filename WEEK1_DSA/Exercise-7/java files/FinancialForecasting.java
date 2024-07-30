public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue; // Base case: no more periods left
        }
        // Recursive case: calculate future value for one period and recurse for remaining periods
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Example: Initial investment of $1000
        double growthRate = 0.05;   // Example: 5% growth rate per period
        int periods = 10;           // Example: Over 10 periods

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: $" + futureValue);
    }
}
