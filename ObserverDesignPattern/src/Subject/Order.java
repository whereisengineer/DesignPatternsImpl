package Subject;

import Observer.OrderAddressObserver;
import Observer.OrderObserver;
import Observer.OrderStatusObserver;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public Order(int order_id, String cust_address, String order_status, double order_amount) {
        this.order_id = order_id;
        this.cust_address = cust_address;
        this.order_status = order_status;
        this.order_amount = order_amount;
    }

    int order_id;
    String cust_address;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
        addressObserverList.forEach(obj->obj.doAction(cust_address));
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
        statusObserverList.forEach(obj-> obj.doAction(order_status));
    }

    public double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(double order_amount) {
        this.order_amount = order_amount;
    }

    String order_status;
    double order_amount;

    //notify order_status change
    List<OrderObserver> addressObserverList = new ArrayList<>();
    List<OrderObserver> statusObserverList = new ArrayList<>();

    public void attachObserver(OrderObserver orderObserver){
        if(orderObserver instanceof OrderAddressObserver){
            addressObserverList.add(orderObserver);
        }
        if(orderObserver instanceof OrderStatusObserver){
            statusObserverList.add(orderObserver);
        }
    }

    public void detachObserver(OrderObserver orderObserver){
        //write the logic to detach the observer
    }

    public void notifyObserver(OrderObserver orderObserver){
//        orderObserver.doAction();
    }
}
