package nestedclass;

/**
 * Created by Jagriti on 1/3/2019.
 */
abstract class AnonymousClass2 {

        abstract void eat();
    }
    class TestAnonymousInner{
        public static void main(String args[]){
            AnonymousClass2 p=new AnonymousClass2(){
                void eat(){System.out.println("nice fruits");}
            };
            p.eat();
        }
    }

/*
A class is created but its name is decided by the compiler which extends the AnonymousClass2 class and provides the implementation of the eat() method.
An object of Anonymous class is created that is referred by p reference variable of Person type.
*/
