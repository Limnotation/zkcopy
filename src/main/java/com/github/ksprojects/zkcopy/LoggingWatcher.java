package com.github.ksprojects.zkcopy;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Watcher implementation that simply logs at debug.
 */
public class LoggingWatcher implements Watcher {
    Logger logger = LoggerFactory.getLogger(LoggingWatcher.class);
    
    @Override
    public void process(WatchedEvent event) {
        logger.debug("Ignoring watched event: " + event);
    }
}