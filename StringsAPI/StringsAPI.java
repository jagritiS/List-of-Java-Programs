package StringsAPI;

/**
 * Created by Jagriti on 9/27/2018.
 */
public class StringsAPI {
    public static void main(String[] args) {
        String strOne = "This is my first app in string api";

        // prints character at 5th location i.e white-space character and throws indexOutofBound exception
       System.out.println("the char at 4 is "+strOne.charAt(4));

        // codepoint at index 1
        int retval = strOne.codePointAt(1);

        // prints character at index1 in string i.e h in this case
        System.out.println("Character(unicode point) = " + retval);

        // codepoint before index 1 i.e T
        int retval2 = strOne.codePointBefore(1);

        // prints character before index1 in string
        System.out.println("Character(unicode point) = " + retval2);

        // codepoint from index 1 to index 8
        int retval3 = strOne.codePointCount(1, 8);

        // prints character from index 1 to index 8
        System.out.println("Codepoint count = " + retval3);

       //compairing two strings
        String str1 = "neo", str2 = "sphere";

        // comparing str1 and str2
        int retval4 = str1.compareTo(str2);

        // prints the return value of the comparison
        if (retval4 > 0) {
            System.out.println("str1 is greater than str2");
        } else if (retval4 == 0) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is less than str2");
        }
        //compairing two string by ignoring the cases
        String str3 = "neo", str4 = "SPHERE";

        // comparing str1 and str2 with case ignored
        int retval5 = str2.compareToIgnoreCase(str4);

        // prints the return value of the comparison
        if (retval5 > 0) {
            System.out.println("str3 is greater than str4");
        } else if (retval5 == 0) {
            System.out.println("str3 is equal to str4");
        } else {
            System.out.println("str1 is less than str2");
        }
        //concatnation of two strings
        // print str2 concatenated with str1
        String str5 = str1.concat(" learning");
        System.out.println(str5);

        // prints str3 concatenated with str2(and str1)
        String str6 = str2.concat(" center");
        System.out.println(str6);
    }
}
