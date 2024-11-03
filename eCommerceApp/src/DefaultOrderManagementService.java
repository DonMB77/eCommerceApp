public class DefaultOrderManagementService implements OrderManagementService {

    private static final int DEFAULT_ORDER_CAPACITY = 10;

    private static DefaultOrderManagementService instance;

    // <implementation pending>

    public static OrderManagementService getInstance() {
        if (instance == null) {
            instance = new DefaultOrderManagementService();
        }
        return instance;
    }

    @Override
    public void addOrder(Order order) {
        // <implementation pending>
    }

    @Override
    public Order[] getOrdersByUserId(int userId) {
        // <implementation pending>
        return null;
    }

    @Override
    public Order[] getOrders() {
        // <implementation pending>
        return null;
    }

    void clearServiceState() {
        // <implementation pending>
    }

}
