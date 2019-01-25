package lambda.methodReference;

/**
 * Created by Jagriti on 1/14/2019.
 */
import java.util.List;
import java.util.ArrayList;

public class Eg1 {


    public interface MyPrinter{
        public void print(String s);
    }
        public static void main(String args[]) {
            List names = new ArrayList();
            names.add("c prgm");
            names.add("java");
            names.add("python");
            names.add("go");
            names.add("ruby");
            names.forEach(System.out::println);

        }
}
