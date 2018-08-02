import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;
import java.util.TimerTask;


public class LogServlet extends HttpServlet {
    //private static final Logger log = Logger.getLogger(LogServlet.class);
    private Logger logger = null;
    @Override
    public void init() throws ServletException {
        //final Logger log = Logger.getLogger(LogServlet.class);
        //BasicConfigurator.configure();
        logger = Logger.getRootLogger();
        /*Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                //System.out.println("Hello world");
                //log.info("Hello World");
            }
        }, 1000,1000);*/
        printHello();
    }

    public void printHello(){
        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                logger.info("Hello world");
            }
        }, 1000,1000);
    }
}
