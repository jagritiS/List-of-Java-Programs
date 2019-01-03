package basics;

import java.util.Scanner;

/**
 * Created by Jagriti on 12/2/2018.
 */
public class EligibleVoters {
    int age;
    public int setAge(int a){
        age = a;
        return age;
    }
    public void checkEligibiltiy(int vA){
        if(vA>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        EligibleVoters ev = new EligibleVoters();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int a  = sc.nextInt();
       int voterAge = ev.setAge(a);
       ev.checkEligibiltiy(voterAge);
    }
}
