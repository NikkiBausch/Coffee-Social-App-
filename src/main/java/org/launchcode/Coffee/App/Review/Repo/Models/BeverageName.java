package org.launchcode.Coffee.App.Review.Repo.Models;



public enum BeverageName {
    DRIPCOFFEE("Drip coffee"),
    CAPPUCCINO("Cappuccino"),
    FILTERCOFFEE("Filter Coffee (French Press, Pour-over, etc.)"),
    LATTE("Latte"),
    FLATWHITE("Flat White"),
    LATTEMACCHIATO("Latte Macchiato"),
    CAFEAULAIT("Cafe au Lait"),
    MOCHACCINO("Mochachino/Mocha latte"),
    MOKA("Moka"),
    ESPRESSOSHOTS("Espresso shots"),
    AMERICANO("Americano"),
    COLDBREW("Cold Brew"),
    ICEDCOFFEE("Iced Coffee"),
    FRAPPE("Frappe"),
    MATCHALATTE("Matcha Latte"),
    TEA("Tea"),
    OTHER("Other");

    private final String displayName;

    BeverageName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
