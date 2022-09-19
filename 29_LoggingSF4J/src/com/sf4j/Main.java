package com.sf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args){
        Logger log = LoggerFactory.getLogger(Main.class);
        log.info("hello world");
        log.warn("hello world");
        log.error("hello world");

    }
}
