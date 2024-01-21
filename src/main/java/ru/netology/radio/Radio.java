package ru.netology.radio;

public class Radio {
    private int radioStationNumber;
    private int volume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseRadioStation() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }
    }

    public void decreaseRadioStation() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }
    }

    public void increaseVolume() {

        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
