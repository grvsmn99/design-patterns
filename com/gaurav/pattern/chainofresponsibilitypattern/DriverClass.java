package com.gaurav.pattern.chainofresponsibilitypattern;

/*
    *Applications:
    * ATM
    * Vending Machine
    * Logging system
 */
public class DriverClass {

    public static void main(String[] args) {
        LogProcessor processLog = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));
        processLog.log("debug", "Debug log");
        processLog.log("error", "error log");
        processLog.log("info", "Info log");
    }
}
