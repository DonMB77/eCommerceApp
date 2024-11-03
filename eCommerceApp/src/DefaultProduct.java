public class DefaultProduct implements Product {

    private int id;
    private String productName;
    private String categoryName;
    private double price;

    public DefaultProduct() {
    }

    public DefaultProduct(int id, String productName, String categoryName, double price) {
        // <implementation pending>
    }

    @Override
    public String toString() {
        // <implementation pending>
        return null;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }


}
