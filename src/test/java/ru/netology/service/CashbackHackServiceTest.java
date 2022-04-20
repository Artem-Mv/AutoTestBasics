package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(100,cashbackHackService.remain(900));
    }
    @Test
    public void shouldReturnZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(0, cashbackHackService.remain(1000));
    }
}