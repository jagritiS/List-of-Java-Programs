package StreamAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jagriti on 1/25/2019.
 */
public class StreamTwo {
    public static void main(String[] args) {
        System.out.println("filtering between multiple contents together");
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2,"Dell Mouse",150f));
        list.add(new Product(4,"Samsung A5",17000f));
        list.add(new Product(5,"Iphone 6S",65000f));
        list.add(new Product(6,"Sony Xperia",25000f));
        list.add(new Product(7,"Nokia Lumia",15000f));
        list.add(new Product(8,"Redmi4 ",26000f));
        list.add(new Product(9, "Lenevo Vibe", 19000f));

        System.out.println("product woth id");
        Product p = list.stream()
                .filter(p1 -> p1.getName().equalsIgnoreCase("Keyboard")).findFirst().get();
        System.out.println(p.toStrings());
        System.out.println("===============ends with ================");
        list.stream()
                .filter(p1 -> p1.getName().endsWith("ia")).forEach(p1->{
            System.out.println(p1.toStrings());
        });
      //  System.out.println(p.toStrings());




    }
}
class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public String getName(){return name;}
    public String toStrings(){
        return "ID :"+this.id +"\nName "+this.name+"\nprice "+this.price;
    }
}
