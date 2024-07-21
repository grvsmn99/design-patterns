package com.gaurav.pattern.observerpattern.observable;

import com.gaurav.pattern.observerpattern.Observer.WheatherObserver;

import java.util.ArrayList;
import java.util.List;

public class TempratureObservable implements WheatherStationObservable {
    List<WheatherObserver> list = new ArrayList<>();
    double data;

    public TempratureObservable() {
        this.data = 0.0;
    }

    @Override
    public void add(WheatherObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(WheatherObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notification() {
        for(WheatherObserver observer : list){
            observer.update();
        }
    }

    @Override
    public void setData(double data) {
        if(data != this.data){
            this.data = data;
            notification();
        }
    }

    @Override
    public double getData() {
        return data;
    }
}
