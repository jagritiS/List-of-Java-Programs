package Encapsulation;

/**
 * Created by Jagriti on 9/28/2018.
 */
public class EncapTest {

        public static void main(String args[]){
            EncapsulationDemo obj = new EncapsulationDemo();
            obj.setEmpName("Mario");
            obj.setEmpAge(32);
            obj.setEmpSSN(112233);
            System.out.println("Employee Name: " + obj.getEmpName());
            System.out.println("Employee SSN: " + obj.getEmpSSN());
            System.out.println("Employee Age: " + obj.getEmpAge());
        }
}
