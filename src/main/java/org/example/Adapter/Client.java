package org.example.Adapter;

public class Client {

    public static void main(String[] args) {

        // Create an instance of the LegacyLogger
        LegacyLogger legacyLogger = new LegacyLogger();

        // Create an adapter for the LegacyLogger
        Logger logger = new LoggerAdapter(legacyLogger);

        // Use the logger to log a message
        logger.info("This is a message from the client using the adapter pattern.");
    }
}
