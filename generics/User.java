package generics;

/**
 * Created by Jagriti on 3/15/2019.
 */
public class User <T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    User(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Main1
{
    public static void main (String[] args)
    {
        User <String, Integer> obj =
                new User<String, Integer>("GfG", 15);

        obj.print();
    }
}