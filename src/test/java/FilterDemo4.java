import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}public class FilterDemo4 {
    public static void main(String[] args) {

        //Filter based on price. If price >25000 add into another collection
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(2, "Dell Laptop", 30000));
        productList.add(new Product(3, "Lenova Laptop", 27000));
        productList.add(new Product(4, "Apple Laptop", 23000));
        productList.add(new Product(5, "Sony Laptop", 90000));

        productList.stream().filter(p-> p.price>25000).forEach(p-> System.out.println("Prices of product greater than 25000 = " + p.price));


    }



}
