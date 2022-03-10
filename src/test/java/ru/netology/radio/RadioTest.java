package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldNewNumberObservedStation() {
        Radio cond = new Radio();
        cond.setNumberObservedStation(5);
        int expected = 5;
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
    void shouldNextNumberObservedStation() {
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
    void shouldPrevNumberObservedStation() {
        Radio cond = new Radio();
        cond.prev(5);
        int expected = 4;
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
    void shouldNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        int expected = 5;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewCurrentVolumeDifferentFromMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewCurrentVolumeDifferentFromMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);
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
    void shouldUpCurrentVolume() {
        Radio cond = new Radio();
        cond.upVolume(9);
        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolume() {
        Radio cond = new Radio();
        cond.downVolume(10);
        int expected = 9;
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
    void shouldDownCurrentVolumeDifferentFromMax() {
        Radio cond = new Radio();
        cond.downVolume(11);
        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }
}