package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Jagriti on 1/25/2019.
 */
public class StreamOne {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Rick");

        list.add("Daryl");
        list.add("Glenn");
        list.add("Goa");
        list.add("Carl");
        list.add("Geneva");
        list.add("Negan");
        list.add("Genuine");
        list.add("games");
        list.add("gum");


        //without stream api
        list.forEach(num -> {
            if (num.startsWith("G")) {
                System.out.println(num);
            }
            if (num.toUpperCase().startsWith("N")) {
                System.out.println(num);
            }
        });
        //with stream api
        System.out.println("============With stream api ====================");
        list
                .stream() //creates stream of list object
                .map(String::toUpperCase) //maps all those string to uppercase
                .filter(s->s.startsWith("G")) //filter to get words with G
                .sorted()//sorts data into asc order
                .forEach(System.out::println); //loops to get data

        System.out.println("===========Using stream API for streams================");
        Stream<String> stringOne = Stream.of("cat","dog","horse","frog","birds");
        Stream<String> stringTwo = Stream.of("cat11","dog12","horse13","frog14","birds15");
        Stream<String> strOneTwo = Stream.concat(stringOne,stringTwo);
        System.out.println("=========================================");
        System.out.println(strOneTwo
                .distinct() //returns distinct elements
                .peek(System.out::println) //Returns a stream which consists of the
                        // elements of this stream generated and performs the provided action,
                        //  on each element consumed from the resulting stream.
                .count()); //counts the total number of the stream generate



    }
}
