package exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class LoggerTest {
    public static void main(String[] args) {
        MyLogger logger = MyLogger.getLogger();
        logger.log("log test");
    }
}