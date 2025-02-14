import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private List<Integer> prefixProduct;

    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Helps in easier calculations
    }
    
    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1); // Reset the prefix product list
        } else {
            prefixProduct.add(prefixProduct.get(prefixProduct.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        if (k >= prefixProduct.size()) {
            return 0; // If k exceeds available numbers after last zero reset
        }
        return prefixProduct.get(prefixProduct.size() - 1) / prefixProduct.get(prefixProduct.size() - 1 - k);
    }
}
