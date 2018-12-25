package loggers;

import beans.Event;
import beans.EventType;

import java.util.Collection;
import java.util.Map;

public class CombinedEventLogger implements EventLogger {

    private final Collection<EventLogger> loggers;

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        super();
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }

}
