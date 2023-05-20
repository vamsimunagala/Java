// Write a program illustrating isAliveand join()
class NewThreadDemo implements Runnable

{
    Thread t;

    NewThreadDemo(String threadName)
      {
            t=new Thread(this, threadName);
            System.out.println("New userdefined child thread created"+threadName);
            t.start();
       }

    public void run()
            {
                try
                 {
                      for(int i = 1; i <=10; i++)
                       {
                           System.out.println("Child Thread: ["+Thread.currentThread().getName()+ "] " + i);
                           Thread.sleep(500);
                        }
                  }
                      catch (InterruptedException e)
                         {
                              System.out.println("UseDefine Child interrupted.");
                          }
                      System.out.println("Exiting UserDeinfed child thread.");
               }
}

class Exercise10b {
    public static void main(String args[])
               {
                    NewThreadDemo ch1 = new NewThreadDemo("Child_One");
                    NewThreadDemo ch2 = new NewThreadDemo("Child_Two");
                    NewThreadDemo ch3 = new NewThreadDemo("Child_Three");
                    NewThreadDemo ch4 = new NewThreadDemo("Child_FOur");

                    System.out.println("Child Thread One is alive: " + ch1.t.isAlive());
                    System.out.println("Child Thread Two is alive: "+ ch2.t.isAlive());
                    System.out.println("Child Thread Three is alive: "+ ch3.t.isAlive());
                    System.out.println("Child Thread Four is alive: "+ch4.t.isAlive());

                     try
                      {
                         System.out.println("Waiting for child threads to finish.");
                         ch1.t.join ();
                         ch2.t.join ();
                         ch3.t.join ();
                         ch4.t.join ();
                       }

                           catch (InterruptedException e)
                                {

                                     System.out.println("Main thread Interrupted");
                                }
                              System.out.println("Child Thread One is alive: " + ch1.t.isAlive());
                              System.out.println("Child Thread Two is alive: "+ ch2.t.isAlive());
                              System.out.println("Child Thread Three is alive: "+ ch3.t.isAlive());
                              System.out.println("Child Thread Four is alive: "+ch4.t.isAlive());
                              System.out.println("Main thread exiting");

                  }
}