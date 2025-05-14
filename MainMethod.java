public class MainMethod {
    public static void main(String[] args) {
        
        //Creating thread using Runnable interface
        MyThread t1= new MyThread();   
        Thread thr=new Thread(t1);      //passing it to the Thread class
        thr.start();

        //Creating thread using Thread class
        AnotherThread t2= new AnotherThread();
        t2.start();
    }
}
