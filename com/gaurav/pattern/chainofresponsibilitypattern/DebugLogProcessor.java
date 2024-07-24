package com.gaurav.pattern.chainofresponsibilitypattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String loglevel, String message) {
        if("debug".equalsIgnoreCase(loglevel)){
            System.out.println(loglevel + ": message : "+message);
        } else {
            super.log(loglevel, message);
        }
    }
}
