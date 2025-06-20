package ecommerce;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SmartProductCatalog {
    // Map of product name -> category
    private Map<String, String> products;

    public SmartProductCatalog() {
        products = new LinkedHashMap<>();
        products.put("iPhone 15 Pro Max", "Mobile");
        products.put("iPhone Charger", "Accessories");
        products.put("Samsung Galaxy S24", "Mobile");
        products.put("Sony WH-1000XM5 Headphones", "Audio");
        products.put("Dell XPS 13 Laptop", "Laptop");
        products.put("Apple MacBook Air M2", "Laptop");
        products.put("Realme Buds Wireless 3", "Audio");
        products.put("Canon EOS 1500D DSLR Camera", "Camera");
        products.put("Samsung Smartwatch Galaxy Watch 6", "Wearable");
        products.put("Apple Watch Series 9", "Wearable");
    }

    public Map<String, List<String>> smartSearch(String keyword) {
        Map<String, List<String>> suggestions = new LinkedHashMap<>();
        suggestions.put("Exact Matches", new ArrayList<>());
        suggestions.put("Related Products", new ArrayList<>());

        for (String product : products.keySet()) {
            if (product.equalsIgnoreCase(keyword)) {
                suggestions.get("Exact Matches").add(formatProduct(product));
            } else if (product.toLowerCase().contains(keyword.toLowerCase())) {
                suggestions.get("Related Products").add(formatProduct(product));
            }
        }

        return suggestions;
    }

    private String formatProduct(String product) {
        return product + " (" + products.get(product) + ")";
    }
}
