package ru.netology.radio;

public class Radio {
    private int radioStation;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber;
    private int currentRadioStationNumber;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int radioStation) {
        this.radioStation = radioStation;
        this.maxRadioStationNumber = radioStation - 1;
        this.currentRadioStationNumber = minRadioStationNumber;

    }

    public int getRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void increaseRadioStation() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void decreaseRadioStation() {
        if (currentRadioStationNumber > minRadioStationNumber) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }
    }

    public void increaseVolume() {

        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
