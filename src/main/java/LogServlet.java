import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

public class LogServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(LogServlet.class.getName());
    @Override
    public void init() throws ServletException {
        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                //System.out.println("Hello world");
                log.info("Hello World");
            }
        }, 1000,1000);
    }
}
