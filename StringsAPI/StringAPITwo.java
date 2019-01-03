package StringsAPI;

/**
 * Created by Jagriti on 10/4/2018.
 */
public class StringAPITwo {
    public static void main(String[] args) {
        String str1 = "neosphere institute", str2 = "http://";

        CharSequence cs1 = "sph";

        // string contains the specified sequence of char values
        boolean retval = str1.contains(cs1);
        System.out.println("Method returns : " + retval +"   So there is character sequence of sph in str1");

        // string does not contain the specified sequence of char value
        retval = str2.contains("_");
        System.out.println("Methods returns: " + retval +"  so there is not character sequence of _ in str1");

        /**Note* : contains throws null pointer exception */
    }
}
