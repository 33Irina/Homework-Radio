package ru.netology.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void aboveMaxCountStation() {
        Radio radio = new Radio (35);
        int expected = radio.getCurrentStation();
        radio.setCurrentStation(37);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void correctMaxCountStation() {
        Radio radio = new Radio(35);
        int expected = 0;
        radio.setCurrentStation(expected);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveMaxStationNumber() {
        Radio radio = new Radio();

        int expected = radio.getCurrentStation();
        radio.setCurrentStation(20);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveMinStationNumber() {
        Radio radio = new Radio();

        int expected = radio.getCurrentStation();
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void correctStationNumber() {
        Radio radio = new Radio();

        int expected = 6;
        radio.setCurrentStation(expected);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNumber() {
        Radio radio = new Radio();
        while (radio.getCurrentStation() < 9) {
            int expected = radio.getCurrentStation() + 1;
            radio.next();
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 0;
        radio.next();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        while (radio.getCurrentStation() > 0) {
            int expected = radio.getCurrentStation() - 1;
            radio.prev();
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 9;
        radio.prev();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveIncreaseVolume() {
        Radio radio = new Radio();

        while (radio.getCurrentVolume() < 100) {
            int expected = radio.getCurrentVolume() + 1;
            radio.increaseVolume();
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        while (radio.getCurrentVolume() > 0) {
            int expected = radio.getCurrentVolume() - 1;
            radio.decreaseVolume();
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}




