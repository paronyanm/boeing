package com.company;
public class BlackBox {
    private String data;

    public BlackBox() {
        this.data = "";

    }
    public void addLog(String message) {
        data = data + "\n " +  message;


    }
    public String getDataByEngineer(Engineer engineer) {


        return data;
    }
}
