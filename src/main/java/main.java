public class main {

    public static void main(String[] args) {

        model.newProduct("Bike","vehicle",1,15,1000,1);
        model.newProduct("Skateboard","vehicle",2,2,400,3);

        model.getAll();

        model.deleteProduct(1);

        model.getAll();
    }


}
