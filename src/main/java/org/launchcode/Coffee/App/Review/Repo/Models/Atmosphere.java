package org.launchcode.Coffee.App.Review.Repo.Models;

public enum Atmosphere {
    COZY("Cozy"),
    INDUSTRIAL("Industrial"),
    COUNTRY("Country"),
    ARTISTIC("Artistic"),
    OTHER("Other");

    private final String displayAtmosphere;

    Atmosphere(String displayAtmosphere) {
        this.displayAtmosphere = displayAtmosphere;
    }

    public String getDisplayAtmosphere() {
        return displayAtmosphere;
    }
}
