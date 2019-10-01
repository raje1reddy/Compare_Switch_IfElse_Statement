package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;


public class CompareSwitchIfElseTest {


    @Test
    public void weekDaySUN() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("SUN");
        System.out.println(result);
        String expected = "SUN";
        assertEquals( expected,result);
        //return result;
    }
    @Test
    public void weekDayMON() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("MON");
        System.out.println(result);
        String expected = "MON";
        assertEquals( expected,result);
        //return result;
    }
    @Test
    public void weekDayTUE() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("TUE");
        System.out.println(result);
        String expected = "TUE";
        assertEquals( expected,result);
        //return result;
    }
    @Test
    public void weekDayWED() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("WED");
        System.out.println(result);
        String expected = "WED";
        assertEquals( expected,result);
        //return result;
    }
    @Test
    public void weekDayTHU() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("THU");
        System.out.println(result);
        String expected = "THU";
        assertEquals( expected,result);
        //return result;
    }

    @Test
    public void weekDayFRI() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("FRI");
        System.out.println(result);
        String expected = "FRI";
        assertEquals( expected,result);
        //return result;
    }

    @Test
    public void weekDay() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("SAT");
        System.out.println(result);
        String expected = "SAT";
        assertEquals( expected,result);
        //return result;
    }

    @Test
    public void weekDayNONE() {
        CompareSwitchIfElse compareSwitchIfElse = new CompareSwitchIfElse();
        String result = compareSwitchIfElse.WeekDays("NONE");
        System.out.println(result);
        String expected = "NONE";
        assertEquals( expected,result);
        //return result;
    }



}

/*
    @Test
    public void testGetRankBaseOfScore10() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(10);
        System.out.println(result);
        int expectedresult = 10;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetRankBaseOfScore30() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(30);
        System.out.println(result);
        int expectedresult = 30;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore40() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(40);
        System.out.println(result);
        int expectedresult = 40;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore0() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(0);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore100() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(100);
        System.out.println(result);
        int expectedresult = 100;
        assertEquals(expectedresult,result);
    }

*/
