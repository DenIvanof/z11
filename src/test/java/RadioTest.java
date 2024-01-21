package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void upVolume() {
        rad.setVolume(50);
        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {
        rad.setVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolume() {
        rad.setVolume(50);
        rad.decreaseVolume();

        int expected = 49;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessMin() {
        rad.setVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation() {
        rad.setRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {
        rad.setRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationLessMin() {
        rad.setRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        rad.setRadioStationNumber(5);
        rad.increaseRadioStation();

        int expected = 6;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {
        rad.setRadioStationNumber(9);
        rad.increaseRadioStation();

        int expected = 0;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        rad.setRadioStationNumber(5);
        rad.decreaseRadioStation();

        int expected = 4;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {
        rad.setRadioStationNumber(0);
        rad.decreaseRadioStation();

        int expected = 9;
        int actual = rad.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMoreMax() {
        rad.setVolume(101);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessMin() {
        rad.setVolume(-1);

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
