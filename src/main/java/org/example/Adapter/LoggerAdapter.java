package org.example.Adapter;

public class LoggerAdapter implements Logger{

    private final LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void info(String message) {
        legacyLogger.LegacyLodder(message);
    }
}
