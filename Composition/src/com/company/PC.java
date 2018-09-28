package com.company;

public class PC { // instead of extending clsses like inheritance

    private Case theCase;
    private Monitor monitor;
    private motherboard  motherboard;

    public PC(Case theCase, Monitor monitor, motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public motherboard getMotherboard() {
        return motherboard;
    }
}
