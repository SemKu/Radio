package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next(int currentStation) {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            this.currentStation = (0);
        }
    }

    public void prev(int currentStation) {
        if (currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = (9);
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            this.currentVolume = (10);
        }
    }

    public void downVolume(int currentVolume) {
        if (currentVolume <= 10) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            this.currentVolume = (0);
        }
    }
}