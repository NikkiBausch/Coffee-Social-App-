package org.launchcode.Coffee.App.Review.Repo.Models;

public enum DatePicker {
    //https://v5.material.angular.io/components/datepicker/overview
    //Research what annotation I need in Spring and java to add this to the enum.
    //Or look for an alternative way to save "the date of visit" variable that is compatible with a Spring Java Backend.

    ADATE("a date"),

    ANOTHERDATE("another date"),

    ANDANOTHERDATE("and another date"),

    ANDHERESYETANOTHERDATE("and here's yet another date");

    private final String displayDate;

    DatePicker(String displayDate) {
        this.displayDate = displayDate;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    //I did it this way for testing purposes. This is not final.

}
