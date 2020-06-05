package ru.netology;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }



    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }



    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }


    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }
    public void IncreaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature += 1;
    }
    public void     DecreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature -= 1;
    }


}


