package com.example.demo.Services;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class ErDetFredag {

    LocalDate date = LocalDate.now();
    DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));


    public String isItFriday() {


        switch (day) {
            case FRIDAY:
                return "wuuhuuu its friday";
            case MONDAY:
                return "There is a long way to friday";
            case TUESDAY:
                return "4 days to Friday";
            case WEDNESDAY:
                return "Half the week is over";
            case THURSDAY:
                return "You can party tommorow";
            case SATURDAY:
                return "Are you hungover?";
            case SUNDAY:
                return "The week is starting tommorow";
        }


        return String.valueOf(day);
    }
}





