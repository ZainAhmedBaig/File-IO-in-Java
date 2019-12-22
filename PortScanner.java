package Lab2;

public class PortScanner implements Runnable{
     String Name;
    public PortScanner(String name)
    {
        this.Name = name;
    }
     public void run()
    {
        while(true){
        System.out.println(Name);
        
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
    }}
     public static void main(String[] args) {
       for(int i = 0;i<5;i++)
        {
    	   PortScanner  thread = new PortScanner("test"+i);
        Thread mt = new Thread(thread);
           mt.start(); 
        }
    }
}
