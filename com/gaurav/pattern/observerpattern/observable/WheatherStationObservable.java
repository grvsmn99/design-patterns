package com.gaurav.pattern.observerpattern.observable;

import com.gaurav.pattern.observerpattern.Observer.WheatherObserver;

public interface WheatherStationObservable {
    void add(WheatherObserver observer);
    void remove(WheatherObserver observer);
    void notification();
    void setData(double temp);
    double getData();
}

