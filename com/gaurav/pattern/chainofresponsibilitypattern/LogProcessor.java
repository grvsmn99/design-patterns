package com.gaurav.pattern.chainofresponsibilitypattern;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(String loglevel, String message){
        if(null != nextLogProcessor){
            nextLogProcessor.log(loglevel, message);
        }
    }

}
