package imterfaces;

import java.lang.reflect.AccessibleObject;

public class MainInterface {
    public static void main(String [] args){
        ACMEBicycle hero = new ACMEBicycle();
        hero.speedUp(10);
        System.out.println("the new speed of bicycle is "+hero.speed);
    }
}
