package org.launchcode.Coffee.App.Review.Repo.Models;

public enum OverallRating {
    ONESTAR("one star"),

    TWOSTARS("two stars"),

    THREESTARS("three stars"),

    FOURSTARS("four stars"),

    FIVESTARS("five stars");

    private final String displayRating;

    OverallRating(String displayRating) {
        this.displayRating = displayRating;
    }

    public String getDisplayRating() {
        return displayRating;
    }
}
