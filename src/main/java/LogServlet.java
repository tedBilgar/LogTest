import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;
import java.util.TimerTask;

public class LogServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        Timer t = new Timer( );
        t.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                System.out.println("Hello world");

            }
        }, 1000,1000);
    }
}
