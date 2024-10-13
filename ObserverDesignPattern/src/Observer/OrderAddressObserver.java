package Observer;

import Subject.Order;

public class OrderAddressObserver implements OrderObserver {

    @Override
    public void doAction(String str) {
        System.out.println("address is changed successfully to: "+ str);

    }
}
