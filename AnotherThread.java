public class AnotherThread extends Thread {
    public void run()
    {
        for (int i=10;i>0;i--)
        {
        System.out.println( "Decreasing value of i:"+i);
        }

        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
    }
    
}
