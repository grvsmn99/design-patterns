package com.gaurav.pattern.observerpattern.Observer;

import com.gaurav.pattern.observerpattern.observable.WheatherStationObservable;

public class MobileObserver implements WheatherObserver{

    long mobileNumber;

    WheatherStationObservable observable;

    public MobileObserver(long mobileNumber, WheatherStationObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update() {
       notifyMobileUsers(observable.getData());
    }
    private void notifyMobileUsers(double data){
        System.out.println(observable.getClass().getName() + "Notifying : "+mobileNumber +"to change data to : "+observable.getData() );
    }
}
