package ECommerceSearch;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SmartProductCatalog {
    private Map<String, String> prods;

    public SmartProductCatalog() {
        prods = new LinkedHashMap<>();
        prods.put("iPhone 15 Pro Max", "Mobile");
        prods.put("iPhone Charger", "Accessories");
        prods.put("Samsung Galaxy S24", "Mobile");
        prods.put("Sony WH-1000XM5 Headphones", "Audio");
        prods.put("Dell XPS 13 Laptop", "Laptop");
        prods.put("Apple MacBook Air M2", "Laptop");
        prods.put("Realme Buds Wireless 3", "Audio");
        prods.put("Canon EOS 1500D DSLR Camera", "Camera");
        prods.put("Samsung Smartwatch Galaxy Watch 6", "Wearable");
        prods.put("Apple Watch Series 9", "Wearable");
    }

    public Map<String, List<String>> smartSearch(String keyword) {
        Map<String, List<String>> sugg = new LinkedHashMap<>();//suggestions
        sugg.put("Exact Matches", new ArrayList<>());
        sugg.put("Related Products", new ArrayList<>());

        for (String product : prods.keySet()) {
            if (product.equalsIgnoreCase(keyword)) {
                sugg.get("Exact Matches").add(formatProduct(product));
            } else if (product.toLowerCase().contains(keyword.toLowerCase())) {
                sugg.get("Related Products").add(formatProduct(product));
            }
        }

        return sugg;
    }

    private String formatProduct(String product) {
        return product + " (" + prods.get(product) + ")";
    }
}
