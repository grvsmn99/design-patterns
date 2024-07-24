package com.gaurav.pattern.statepattern;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
