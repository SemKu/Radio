package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldMaxNewNumberObservedStation() {
        Radio cond = new Radio();
        cond.setNumberObservedStation(9);
        int expected = 9;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinNewNumberObservedStation() {
        Radio cond = new Radio();
        cond.setNumberObservedStation(0);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewNumberObservedStationDifferentFromMax() {
        Radio cond = new Radio();
        cond.setNumberObservedStation(10);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewNumberObservedStationDifferentFromMin() {
        Radio cond = new Radio();
        cond.setNumberObservedStation(-1);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStationAfterMin() {
        Radio cond = new Radio();
        cond.next(0);
        int expected = 1;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStationAfterMax() {
        Radio cond = new Radio();
        cond.next(9);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStation() {
        Radio cond = new Radio();
        cond.next(8);
        int expected = 9;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStation() {
        Radio cond = new Radio();
        cond.prev(1);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStationAfterMin() {
        Radio cond = new Radio();
        cond.prev(0);
        int expected = 9;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStationDifferentFromMax() {
        Radio cond = new Radio();
        cond.prev(10);
        int expected = 0;
        int actual = cond.getNumberObservedStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAfterFromMinNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);
        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAfterFromMaxNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldUpCurrentVolumeAfterMax() {
        Radio cond = new Radio();
        cond.upVolume(10);
        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpCurrentVolumeAfterMin() {
        Radio cond = new Radio();
        cond.upVolume(0);
        int expected = 1;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolume() {
        Radio cond = new Radio();
        cond.downVolume(1);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeAfterMin() {
        Radio cond = new Radio();
        cond.downVolume(0);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeAfterMax() {
        Radio cond = new Radio();
        cond.downVolume(10);
        int expected = 9;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeDifferentAfterMax() {
        Radio cond = new Radio();
        cond.downVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

}