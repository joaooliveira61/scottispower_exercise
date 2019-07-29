package com.scottishpower.techexercise.model;

import javax.persistence.*;

@Entity
@Table(name = "SMART_READ")
public class SmartRead {

    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_NUMBER")
    private long accountNumber;
    @Column(name = "GAS_ID")
    private long gasId;
    @Column(name = "ELEC_ID")
    private long elecId;
    @Column(name = "ELEC_SMART_READ")
    private double elecSmartRead;
    @Column(name = "GAS_SMART_READ")
    private double gasSmartRead;

    public SmartRead() {

    }

    public SmartRead(long accountNumber, long gasId, long elecId, double elecSmartRead, double gasSmartRead) {
        this.accountNumber = accountNumber;
        this.gasId = gasId;
        this.elecId = elecId;
        this.elecSmartRead = elecSmartRead;
        this.gasSmartRead = gasSmartRead;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getGasId() {
        return gasId;
    }

    public void setGasId(long gasId) {
        this.gasId = gasId;
    }

    public long getElecId() {
        return elecId;
    }

    public void setElecId(long elecId) {
        this.elecId = elecId;
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