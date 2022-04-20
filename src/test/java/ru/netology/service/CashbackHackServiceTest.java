package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnHundred() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(900), 100);
    }
    @Test
    public void shouldReturnZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertEquals(cashbackHackService.remain(1000), 0);
    }
}