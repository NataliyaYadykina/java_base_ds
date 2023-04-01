import java.util.logging.Level; 
import java.util.logging.Logger;
import java.io.IOException;
// import java.util.ArrayList;
import java.util.Random;
import java.util.logging.*; 
  

public class log_demo {
    public static void main(String[] args) throws IOException{
        Logger ll = Logger.getLogger(log_demo.class.getName());
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter formatter = new XMLFormatter();
        fh.setFormatter(formatter);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            ll.log(Level.INFO, "element: ", a);
        }
        ll.log(Level.WARNING, "logger off" );
        ll.info("test");
        ll.warning("logsPath");
    }
}