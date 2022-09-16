package com.main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Main.class);
        log.info("hello world");
        //log.warning("hello world");
        log.error("hello world");
    }
}