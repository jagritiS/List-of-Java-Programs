package Multithreading;

/**
 * Created by Jagriti on 1/31/2019.
 */
public class ThreadingOne extends Thread{
    String name;
    public void run(){
        int count = 0;
        while(count<=3){
            System.out.println(Thread.activeCount());
            name = Thread.currentThread().getName();
            count++;
            System.out.println(name);
            if(name.equals("Thread1")){
                System.out.println("jagriti");
            }else{
                System.out.println("no jagriit");
            }
        }
    }

    public static void main(String[] args) {
        ThreadingOne obj = new ThreadingOne();
        obj.setName("thread1");
        System.out.println(Thread.currentThread().isAlive());//Display the status of the thread, whether alive or no
        System.out.println(obj.isAlive());//Display the status of the thread, whether alive or no
        obj.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(obj.isAlive());//Display the status of the thread, whether alive or no


    }
}
