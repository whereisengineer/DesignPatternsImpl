package Observer;

public class OrderStatusObserver implements OrderObserver{
    @Override
    public void doAction(String str) {
        System.out.println("Order status is changed successfully to "+ str);

    }
}
