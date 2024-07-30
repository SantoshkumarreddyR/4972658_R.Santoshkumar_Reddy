public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 450.0),
            new Order("O004", "David", 200.0),
            new Order("O005", "Eve", 350.0)
        };

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reinitialize orders array
        orders = new Order[] {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 450.0),
            new Order("O004", "David", 200.0),
            new Order("O005", "Eve", 350.0)
        };

        // Quick Sort
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders sorted by Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
