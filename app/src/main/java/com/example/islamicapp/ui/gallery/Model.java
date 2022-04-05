package com.example.islamicapp.ui.gallery;

public class Model {

    String Ramadan;
    String Suhoor;
    String Iftar;

    public Model(String ramadan, String suhoor, String iftar) {

        Ramadan = ramadan;
        Suhoor = suhoor;
        Iftar = iftar;
    }

    public String getRamadan() {
        return Ramadan;
    }

    public void setRamadan(String ramadan) {
        Ramadan = ramadan;
    }

    public String getSuhoor() {
        return Suhoor;
    }

    public void setSuhoor(String suhoor) {
        Suhoor = suhoor;
    }

    public String getIftar() {
        return Iftar;
    }

    public void setIftar(String iftar) {
        Iftar = iftar;
    }
}
