package generics;

/**
 * Created by Jagriti on 3/15/2019.
 */
public class Person<P> {
    P personOne;

    public Person(P personOne) {
        this.personOne = personOne;
    }

    public P getPersonOne() {
        return personOne;
    }
}
class Main
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Person <Integer> iObj = new Person<Integer>(15);
        System.out.println(iObj.getPersonOne());

        // instance of String type
        Person <String> sObj =
                new Person<String>("Person name");
        System.out.println(sObj.getPersonOne());
    }
}
