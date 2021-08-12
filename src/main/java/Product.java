public class Product {

    private String name,type,id;
    private double weight,price;
    private int quantity;

    public String toString(){
        String productAtt="Product: "+this.name+"\nWeight: "+this.weight+"\nType: "
                +this.type+"\nPrice: $"+this.price+"\nID: "+this.id+"\nQuantity: "+this.quantity;
        return productAtt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
