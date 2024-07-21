package com.gaurav.pattern.observerpattern;

import com.gaurav.pattern.observerpattern.Observer.MobileObserver;
import com.gaurav.pattern.observerpattern.Observer.WheatherObserver;
import com.gaurav.pattern.observerpattern.observable.TempratureObservable;
import com.gaurav.pattern.observerpattern.observable.WheatherStationObservable;
import com.gaurav.pattern.observerpattern.observable.WindSpeedObservable;

import java.util.ArrayList;

public class DriverClass {

    public static void main(String[] args) {
        WheatherStationObservable tempObservable = new TempratureObservable();
        WheatherStationObservable windObservable = new WindSpeedObservable();

        WheatherObserver observer1 = new MobileObserver(9513223117l, tempObservable);
        WheatherObserver observer2 = new MobileObserver(9513223116l, tempObservable);
        WheatherObserver observer3 = new MobileObserver(9513223116l, windObservable);

        tempObservable.add(observer1);
        tempObservable.add(observer2);
        windObservable.add(observer3);

        tempObservable.setData(30.0);
        windObservable.setData(10.0);
    }
}
