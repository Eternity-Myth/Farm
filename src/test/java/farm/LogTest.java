package farm;

import org.apache.log4j.Logger;

public class LogTest {

    private static Logger logger = Logger.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.info("日志测试");
    }
}
