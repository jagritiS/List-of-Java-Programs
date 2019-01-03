package basics;

/**
 * Created by Jagriti on 12/2/2018.
 */
public class Looping {
    public static void main(String[] args) {
        for (int i=1;i<20;i++){
            if(i%2 == 0){
                System.out.println(i+" is an even number ");
            }else{
                System.out.println(i+" is not an even number ");
            }
        }
    }
}
