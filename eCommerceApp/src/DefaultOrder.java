public class DefaultOrder implements Order {

    private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

    private String creditCardNumber;
    private Product[] products;
    private int customerId;

    @Override
    public boolean isCreditCardNumberValid(String creditCardNumber) {
        // <implementation pending>
        return false;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        // <implementation pending>
    }

    @Override
    public void setProducts(Product[] products) {
        // <implementation pending>
    }

    @Override
    public void setCustomerId(int customerId) {
        // <implementation pending>
    }


    @Override
    public int getCustomerId() {
        return this.customerId;
    }

    @Override
    public String toString() {
        // <implementation pending>
        return null;
    }





}
