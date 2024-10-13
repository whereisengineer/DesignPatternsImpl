package Client;

import Observer.OrderAddressObserver;
import Observer.OrderStatusObserver;
import Subject.Order;

public class Client {
    public void orderCreationAndModification(){

        Order order = new Order(1, "kanpur","created", 300.89 );
//        OrderAddressObserver orderAddressObserver = new OrderAddressObserver();
        order.attachObserver(new OrderAddressObserver());
        order.attachObserver(new OrderStatusObserver());
        order.setOrder_status("cancelled");
        order.setCust_address("Bangalore");
    }
}
