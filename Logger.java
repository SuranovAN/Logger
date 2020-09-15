import java.time.LocalDateTime;

public class Logger {
    private int num = 1;

    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now() + " " + num++ + "]" + msg);
    }

    private static Logger logger;

    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
