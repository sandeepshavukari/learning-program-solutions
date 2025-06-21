package ECommerceSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ECommerceSearch 
{
	public static void main(String args[])
	{
		SmartProductCatalog catalog = new SmartProductCatalog();
        Scanner sc = new Scanner(System.in);

        System.out.println("==== E-Commerce Smart Search ====");
        while (true) {
            System.out.print("\nEnter search keyword (or type 'exit' to quit): ");
            String inp = sc.nextLine();

            if ("exit".equalsIgnoreCase(inp)) {
                System.out.println("Thank you for using Smart Search. Goodbye!");
                break;
            }

            Map<String, List<String>> res = catalog.smartSearch(inp);

            if (res.get("Exact Matches").isEmpty() && res.get("Related Products").isEmpty()) {
                System.out.println("No products found for: " + inp);
            } else {
                if (!res.get("Exact Matches").isEmpty()) {
                    System.out.println("Exact Matches:");
                    for (String prod : res.get("Exact Matches")) {
                        System.out.println("- " + prod);
                    }
                }
                if (!res.get("Related Products").isEmpty()) {
                    System.out.println("Related Products:");
                    for (String prod : res.get("Related Products")) {
                        System.out.println("- " + prod);
                    }
                }
            }
        }

	}
}
	