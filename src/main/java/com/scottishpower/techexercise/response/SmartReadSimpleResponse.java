package com.scottishpower.techexercise.response;

/**
 * Class used for returning only the electrical and gas SMART readings.
 * Instead of applying the @Transient annotation to the SmartRead class,
 * I've chosen to create a response package where Response classes are
 * created, as this gives greater control on the data I wish to return
 */
public class SmartReadSimpleResponse {

    private double elecSmartRead;
    private double gasSmartRead;

    public SmartReadSimpleResponse() {

    }

    public SmartReadSimpleResponse(double elecSmartRead, double gasSmartRead) {
        this.elecSmartRead = elecSmartRead;
        this.gasSmartRead = gasSmartRead;
    }

    public double getElecSmartRead() {
        return elecSmartRead;
    }

    public void setElecSmartRead(double elecSmartRead) {
        this.elecSmartRead = elecSmartRead;
    }

    public double getGasSmartRead() {
        return gasSmartRead;
    }

    public void setGasSmartRead(double gasSmartRead) {
        this.gasSmartRead = gasSmartRead;
    }
}
