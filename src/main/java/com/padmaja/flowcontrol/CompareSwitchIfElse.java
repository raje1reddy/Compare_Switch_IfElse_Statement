package com.padmaja.flowcontrol;
import java.lang.String;


    public class CompareSwitchIfElse  {
        public String WeekDays(String day) {
            switch (day) {
                case "MON":
                case "TUE":
                case "WED":
                case "THU":
                    System.out.println("Time to work");
                    break;
                case "FRI":
                    System.out.println("Nearing Weekend");
                    break;
                case "SAT":
                case "SUN":
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.println("Invalid day?");
                    break;
            }
            return day;
        }
    }
