package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RadioTest {

    @Test
    public void shouldNextStation(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(6);
        radioman.setNext(false);
        radioman.setPrev(true);

        assertEquals( false, radioman.isNext(false));
        assertEquals( true, radioman.isPrev(true));
        assertEquals( 6, radioman.getNumberCurrentStation());
        radioman.setNextStation(7);
        assertEquals( 0, radioman.getNextStation());
    }

    @Test
    public void shouldNextStation1(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(9);
        radioman.setNext(true);
        radioman.setPrev(false);

        assertEquals( true, radioman.isNext(true));
        assertEquals( false, radioman.isPrev(false));
        assertEquals( 9, radioman.getNumberCurrentStation());
        radioman.setNextStation(10);
        assertEquals( 0, radioman.getNextStation());
    }

    @Test
    public void shouldNextStation2(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(7);
        radioman.setNext(true);
        radioman.setPrev(false);

        assertEquals( true, radioman.isNext(true));
        assertEquals( false, radioman.isPrev(false));
        assertEquals( 7, radioman.getNumberCurrentStation());
        radioman.setNextStation(8);
        assertEquals( 8, radioman.getNextStation());
    }

    @Test
    public void shouldPrevStation(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(0);
        radioman.setNext(false);
        radioman.setPrev(true);

        assertEquals( false, radioman.isNext(false));
        assertEquals( true, radioman.isPrev(true));
        assertEquals( 0, radioman.getNumberCurrentStation());
        radioman.setPrevStation(9);
        assertEquals( 9, radioman.getPrevStation());
    }

    @Test
    public void shouldPrevStation1(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(0);
        radioman.setNext(true);
        radioman.setPrev(false);

        assertEquals( true, radioman.isNext(true));
        assertEquals( false, radioman.isPrev(false));
        assertEquals( 0, radioman.getNumberCurrentStation());
        radioman.setPrevStation(9);
        assertEquals( 0, radioman.getPrevStation());
    }

    @Test
    public void shouldPrevStation2(){
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);

        radioman.setNumberCurrentStation(3);
        radioman.setNext(false);
        radioman.setPrev(true);

        assertEquals( false, radioman.isNext(false));
        assertEquals( true, radioman.isPrev(true));
        assertEquals( 3, radioman.getNumberCurrentStation());
        radioman.setPrevStation(2);
        assertEquals( 2, radioman.getPrevStation());
    }

    @Test
    public void shouldIncreaseVolume(){
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);

        radioman.setCurrentVolume(10);
        radioman.setIncrease(true);
        radioman.setDecrease(false);

        assertEquals( true, radioman.isIncrease(true));
        assertEquals( false, radioman.isDecrease(false));
        assertEquals( 10, radioman.getCurrentVolume());
        radioman.setIncreaseCurrentVolume(10);
        assertEquals( 10, radioman.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume1(){
        Radioman radio = new Radioman();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);

        radio.setCurrentVolume(10);
        radio.setIncrease(false);
        radio.setDecrease(true);

        assertEquals( false, radio.isIncrease(false));
        assertEquals( true, radio.isDecrease(true));
        assertEquals( 10, radio.getCurrentVolume());
        radio.setIncreaseCurrentVolume(10);
        assertEquals( 0, radio.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume2(){
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);

        radioman.setCurrentVolume(7);
        radioman.setIncrease(true);
        radioman.setDecrease(false);

        assertEquals( true, radioman.isIncrease(true));
        assertEquals( false, radioman.isDecrease(false));
        assertEquals( 7, radioman.getCurrentVolume());
        radioman.setIncreaseCurrentVolume(8);
        assertEquals( 8, radioman.getIncreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume(){
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);

        radioman.setCurrentVolume(0);
        radioman.setIncrease(false);
        radioman.setDecrease(true);

        assertEquals( false, radioman.isIncrease(false));
        assertEquals( true, radioman.isDecrease(true));
        assertEquals( 0, radioman.getCurrentVolume());
        radioman.setDecreaseCurrentVolume(0);
        assertEquals( 0, radioman.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume1(){
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);

        radioman.setCurrentVolume(0);
        radioman.setIncrease(true);
        radioman.setDecrease(false);

        assertEquals( true, radioman.isIncrease(true));
        assertEquals( false, radioman.isDecrease(false));
        assertEquals( 0, radioman.getCurrentVolume());
        radioman.setDecreaseCurrentVolume(0);
        assertEquals( 0, radioman.getDecreaseCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume2(){
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);

        radioman.setCurrentVolume(3);
        radioman.setIncrease(false);
        radioman.setDecrease(true);

        assertEquals( false, radioman.isIncrease(false));
        assertEquals( true, radioman.isDecrease(true));
        assertEquals( 3, radioman.getCurrentVolume());
        radioman.setDecreaseCurrentVolume(2);
        assertEquals( 2, radioman.getDecreaseCurrentVolume());
    }

}