package ru.netology.radio;

public class Radio {
    private int numberObservedStation;
    private int currentVolume;


    public int getNumberObservedStation() {
        return numberObservedStation;
    }

    public void setNumberObservedStation(int newNumberObservedStation) {
        if (newNumberObservedStation > 9) {
            return;
        }
        if (newNumberObservedStation < 0) {
            return;
        }
        this.numberObservedStation = newNumberObservedStation;
    }

    public void next(int newNumberObservedStation) {
        if (newNumberObservedStation < 9) {
            this.numberObservedStation = newNumberObservedStation + 1;
        }
        if (newNumberObservedStation == 9) {
            this.numberObservedStation = (0);
        }
    }

    public void prev(int newNumberObservedStation) {
        if (newNumberObservedStation <= 9) {
            this.numberObservedStation = newNumberObservedStation - 1;
        }
        if (newNumberObservedStation == 0) {
            this.numberObservedStation = (9);
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

    public void upVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            this.currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume == 10) {
            this.currentVolume = (10);
        }
    }

    public void downVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 10) {
            this.currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0) {
            this.currentVolume = (0);
        }
    }
}
