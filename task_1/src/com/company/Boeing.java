package com.company;

import java.util.Date;

public class Boeing extends Plane {
    public Boeing(BlackBox blackBox) {
        super(blackBox);

    }
    public void flyAndCrush() {
        flyProcess();
        crushProcess();

    }
    private void flyProcess() {
        Date date = new Date();

        addLog("Боинг взлетел в " + date.getTime() + " часов");
    }
    private void crushProcess() {
        Date date = new Date();

        addLog("Боинг упал в " + date.getTime() + " часов");
    }

}
