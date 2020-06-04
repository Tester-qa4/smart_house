package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
@Test
public void shouldGetAndSet() {
    Conditioner conditioner = new Conditioner();
    String expected = "Кондишн";

    assertNull(conditioner.getName());
    conditioner.setName(expected);
    assertEquals(expected, conditioner.getName());
}
@Test
void shouldIncreaseCurrentTemperatureTest() {
    Conditioner conditioner = new Conditioner();
    conditioner.setMaxTemperature(30);
    conditioner.setMinTemperature(0);
    conditioner.setCurrentTemperature(15);
    assertEquals(15, conditioner.getCurrentTemperature());
    conditioner.IncreaseCurrentTemperature();
    assertEquals(16, conditioner.getCurrentTemperature());
}
@Test
void shouldIncreaseCurrentTemperatureTestMax() {
    Conditioner conditioner = new Conditioner();
    conditioner.setMaxTemperature(30);
    conditioner.setMinTemperature(0);
    conditioner.setCurrentTemperature(30);
    assertEquals(30, conditioner.getCurrentTemperature());
    conditioner.IncreaseCurrentTemperature();
    assertEquals(30, conditioner.getCurrentTemperature());
}
    @Test
    void shouldDecreaseCurrentTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(30);
        assertEquals(30, conditioner.getCurrentTemperature());
        conditioner.DecreaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }
    @Test
    void shouldDecreaseCurrentTemperatureTestMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(0);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.DecreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());
}
}