package basics;

/**
 * Created by Jagriti on 12/2/2018.
 */
public class Arrays {
    public static void main (String[] args)
    {
        // declares an Array of integers.
        int[] arr;
        // allocating memory for 5 integers.
        arr = new int[5];
        // initialize the first elements of the array
        arr[0] = 10;
        // initialize the second elements of the array
        arr[1] = 20; arr[2] = 30;arr[3] = 40; arr[4] = 50;
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);}
        for (int num : arr)        {
            System.out.println("the number from for each loop is "+num);
        }
    }
}
