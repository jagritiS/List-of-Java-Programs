package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jagriti on 1/8/2019.
 */
public class LambdaEg3 {
    interface Test{
        public int thisIstest(int a);
    }
    public static void main(String[] args) {
        Test t  = (a)->{
            if(a>0){
                return a;
            }else{
                return 0;
            }
        };
        int c = t.thisIstest(5);
        System.out.println(c);

        /*LAMBDA FOR LOOPING*/
        List<String> list=new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.forEach(
                // lambda expression
                (names) -> System.out.println(names)
        );
        /*LAMBDA FOR HASHMAPS*/
        Map<String, Integer> prices = new HashMap<>();
        prices.put("Apple", 50);
        prices.put("Orange", 20);
        prices.put("Banana", 10);
        prices.put("Grapes", 40);
        prices.put("Papaya", 50);
		/* Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/
        prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));

    }
}
