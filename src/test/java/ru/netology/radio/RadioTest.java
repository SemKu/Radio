package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldMaxNewNumberObservedStation() {
        Radio cond = new Radio();
        cond.setMaxStation(9);

        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinNewNumberObservedStation() {
        Radio cond = new Radio();
        cond.setMinStation(0);

        cond.setCurrentStation(0);

        int expected = 0;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewNumberObservedStationDifferentFromMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);

        int expected = 0;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNewNumberObservedStationDifferentFromMin() {
        Radio cond = new Radio();

        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStationAfterMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        cond.next();

        int expected = 1;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStationAfterMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        cond.next();

        int expected = 0;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextNumberObservedStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(8);

        cond.next();

        int expected = 9;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(1);

        cond.prev();

        int expected = 0;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStationAfterMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);

        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevNumberObservedStationDifferentFromMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(11);

        cond.prev();

        int expected = 9;
        int actual = cond.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinNewCurrentVolume() {
        Radio cond = new Radio();
        cond.setMinVolume(0);

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
        cond.setMaxVolume(10);

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
        cond.setCurrentVolume(10);

        cond.upVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpCurrentVolumeAfterMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.upVolume();

        int expected = 1;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldUpCurrentVolumePenultimate() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        cond.upVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void shouldDownCurrentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        cond.downVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeAfterMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);

        cond.downVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeAfterMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        cond.downVolume();

        int expected = 9;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDownCurrentVolumeDifferentAfterMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(12);

        cond.downVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

}