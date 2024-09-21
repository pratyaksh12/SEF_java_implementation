import java.util.ArrayList;
public class ShoppingCart {
    private int cartID;
    private double totalPrice;
    private ArrayList<Product> productList;

    public void updateCart(Product product){
        productList.add(product);
    }

    public void showProducts(){
        for(Product product : productList){
            product.getDetails();
        }
    }
    public void showTotalPrice(){
        System.out.println(totalPrice);
    }
}
