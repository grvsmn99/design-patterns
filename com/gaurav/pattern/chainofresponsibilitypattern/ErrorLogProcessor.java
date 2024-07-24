package com.gaurav.pattern.chainofresponsibilitypattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String loglevel, String message) {
        if ("error".equalsIgnoreCase(loglevel)){
            System.out.println(loglevel + ": message: "+message);
        } else {
            super.log(loglevel, message);
        }
    }
}
