import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting1 {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue; // Base case
        }
        if (memo.containsKey(periods)) {
            return memo.get(periods); // Return cached result
        }
        double result = calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
        memo.put(periods, result); // Cache the result
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000; // Example: Initial investment of $1000
        double growthRate = 0.05;   // Example: 5% growth rate per period
        int periods = 10;           // Example: Over 10 periods

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: $" + futureValue);
    }
}
