package lambda.BlockLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample10{
    public static void main(String[] args) {
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
        list.add(new Product(9,"Lenevo Vibe",19000f));
        System.out.println("Sorting on the basis of name...");
        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        System.out.println("Using filter data for price \n \n");

        //after stream api
        // using lambda to filter data
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name + ": " + product.price)
        );
    }
}


