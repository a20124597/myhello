package com.own.myhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyLog.class);

    public void PrintLog() {
        LOGGER.error(String.format("error addAdmin failed for %s: %s", "userName", "message"));
        LOGGER.info(String.format("info addAdmin failed for %s: %s", "userName", "message"));
        LOGGER.warn(String.format("error addAdmin failed for %s: %s", "userName", "message"));
    }
}
