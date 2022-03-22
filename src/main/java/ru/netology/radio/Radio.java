package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;


    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next(int currentStation) {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        }
    }

    public void prev(int currentStation) {
        if (currentStation <= maxStation) {
            this.currentStation = currentStation - 1;
        }
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void downVolume(int currentVolume) {
        if (currentVolume <= maxVolume) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        }
    }
}