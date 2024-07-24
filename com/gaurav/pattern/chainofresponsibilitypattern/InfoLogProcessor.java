package com.gaurav.pattern.chainofresponsibilitypattern;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String loglevel, String message) {
        if ("info".equalsIgnoreCase(loglevel)){
            System.out.println(loglevel + ": message: "+message);
        }else {
            super.log(loglevel, message);
        }
    }
}
