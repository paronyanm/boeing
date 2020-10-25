package com.company;

import java.util.Date;

public class Plane {
    private BlackBox blackBox;

    public Plane(BlackBox blackBox) {
        this.blackBox = blackBox;


    }
    public void flyAndCrush() {
        flyProcess();
        crushProcess();

    }
    private void flyProcess() {
        Date date = new Date();

        addLog("Самолет взлетел в " + date.getTime() + " часов");
    }
    private void crushProcess() {
        Date date = new Date();

       addLog("Самолет упал в " + date.getTime() + " часов");
    }
    protected void addLog(String message) {
        blackBox.addLog(message);
    }
    public void getBoxForEngineer(Engineer engineer) {
        engineer.setBox(this.blackBox);
    }
}
