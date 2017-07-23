import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jotaiwan on 23/07/2017.
 */
public class TestRunApp {

    //No static, else log.name.IS_UNDEFINED.log
    private final Logger logger = LoggerFactory.getLogger(TestRunApp.class);

    public static void main(String[] args) {
        //Set this before the logger start.
        System.setProperty("log.name", "abcdefg");

        TestRunApp obj = new TestRunApp();
        obj.start();

    }

    private void start() {

        logger.debug("------ Starting Ant------");
        //...
    }
}
