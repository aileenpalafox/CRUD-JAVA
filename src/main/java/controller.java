import java.util.ArrayList;

public class controller {
    private static ArrayList<Product> products = new ArrayList();

    public static void newProduct(String name, String type, String id, double weight, double price, int quantity) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setType(type);
        product.setWeight(weight);
        product.setId(id);
        products.add(product);
    }

    public static void getAll(){
        System.out.println("PRODUCTOS\n");
        for (Product p:products) {
            System.out.println(p.toString()+"\n");
        }
    }
}