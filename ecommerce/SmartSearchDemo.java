package ecommerce;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SmartSearchDemo {
    public static void main(String[] args) {
        SmartProductCatalog catalog = new SmartProductCatalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== E-Commerce Smart Search ====");
        while (true) {
            System.out.print("\nEnter search keyword (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Thank you for using Smart Search. Goodbye!");
                break;
            }

            Map<String, List<String>> results = catalog.smartSearch(input);

            if (results.get("Exact Matches").isEmpty() && results.get("Related Products").isEmpty()) {
                System.out.println("No products found for: " + input);
            } else {
                if (!results.get("Exact Matches").isEmpty()) {
                    System.out.println("Exact Matches:");
                    for (String product : results.get("Exact Matches")) {
                        System.out.println("- " + product);
                    }
                }
                if (!results.get("Related Products").isEmpty()) {
                    System.out.println("Related Products:");
                    for (String product : results.get("Related Products")) {
                        System.out.println("- " + product);
                    }
                }
            }
        }

        scanner.close();
    }
}
