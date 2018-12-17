
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WATCHARAPOL PLOYJAN
 */
public class OrderService {

    public static void addOrder(ArrayList<Cart> list) {
        OrderDao.addOrder(list);

    }

    public static ArrayList<Order> getOrder() {
        ArrayList<Order> order = OrderDao.getOrder(LoginForm.userCurrent);
        return order;
        //System.out.println("Open Success");
    }

    public static int calculateTotalPrice() {
        ArrayList<Order> order = OrderDao.getOrder((LoginForm.userCurrent));
        ArrayList<Integer> arr = new ArrayList<>();
        // ArrayList<Cart> list = CartService.getAllProduct(user);
        int sum = 0;
        for (Order e : order) {
            for (Cart ee : e.getOrder()) {
                sum = sum + (ee.getProduct().getPrice() * ee.getNum());
            }
        }
        return sum;
    }

    public static void addToOrder() {
        try {
            CartService.addCartToOrder((LoginForm.userCurrent));
        } catch (Exception e) {
        }

    }

}
