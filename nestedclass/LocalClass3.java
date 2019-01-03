package nestedclass;

/**
 * Created by Jagriti on 1/2/2019.
 */
public class LocalClass3 {
    public int data = 10;

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        LocalClass3 localClass3 = new LocalClass3();
        if (localClass3.getData() < 20) {
            // Local inner class inside if clause
            class Inner {
                public int getValue() {
                    System.out.println("Inside Inner class");
                    return localClass3.data;
                }
            }
            Inner inner = new Inner();
            System.out.println(inner.getValue());
        }else {
            System.out.println("Inside LocalClass3 class");
        }
    }
}

