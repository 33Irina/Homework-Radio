package ru.netology.Homework;

public class Radio {
    private int currentStation;
    private int currentVolume = 5;
    private int countStation = 10;

    public Radio() {

    }

    public Radio(int newCountStation) {
        countStation = newCountStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0)
            return;
        if (currentStation > countStation-1) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;

    }


    public void next() {
        if (currentStation < countStation - 1)
            currentStation++;
        else
            currentStation = 0;

    }

    public void prev() {
        if (currentStation > 0)
            currentStation--;
        else
            currentStation = countStation - 1;

    }

    public void increaseVolume() {
        if (currentVolume < 100)
            currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume > 0)
            currentVolume--;
    }

}
