package Models;

import java.util.Date;
import java.util.Map;

public class Order extends BaseModel{
    private CustomerSession customerSession;
    private Map<Dish, Integer> dishes;


    public CustomerSession getCustomerSession() {
        return customerSession;
    }

    public void setCustomerSession(CustomerSession customerSession) {
        this.customerSession = customerSession;
    }

    public Map<Dish, Integer> getDishes() {
        return dishes;
    }

    public void setDishes(Map<Dish, Integer> dishes) {
        this.dishes = dishes;
    }
}
