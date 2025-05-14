class MyThread implements Runnable {
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Increasing value of i:"+i);
            try {
                Thread.sleep(1000);   
            } catch (Exception e) {
            }
        }
    }
    
}
