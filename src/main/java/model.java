import java.util.HashMap;
import java.util.Map;

public class model {
    //private static ArrayList<Product> products = new ArrayList();
    private static Map<Integer,Product> products = new HashMap<>();

    public static void newProduct(String name, String type, int id, double weight, double price, int quantity) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setType(type);
        product.setWeight(weight);
        product.setId(id);
        products.put(id, product);
    }

    public static void getAll(){
        System.out.println("PRODUCTOS\n");
        
        for (Product p:products.values()) {
            System.out.println(p.toString()+"\n");
        }
    }

    public static void deleteProduct(int id){
        if(products.containsKey(id)){
            products.remove(id);
        }else{
            System.out.println("Key doesn't exist");
        }
    }
}