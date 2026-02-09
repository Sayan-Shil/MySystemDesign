package LLD.DesignPattern.CreationalDesignPattern.SingletonFactoryPattern.SingletonWay;

public class Logger {

    private static volatile Logger logger;

    private Logger(){}

    public static Logger getInstance() {

        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {   // second check required
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
