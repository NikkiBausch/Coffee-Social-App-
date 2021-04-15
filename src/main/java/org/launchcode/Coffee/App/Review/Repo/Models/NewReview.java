package org.launchcode.Coffee.App.Review.Repo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

//In our dropdown menu classes,I have included a last display name item for "other" +
// in case we did not consider all cases.
//Another thing I'm not sure about--I don't know how to implement the id from the NewUser API
//into the NewReview Repository.
//Form review items work on MySQL workbench!!! :D :D :D
//I loaded the main class with test reviews (commented out), and they also generated the constructor successfully.

@Entity
public class NewReview {

    @Id
    @GeneratedValue
    @JoinColumn(name="id")
    private int id;

    //DatePicker enum is functional, but contains test dropdown menu items and needs attention.
    @JoinColumn(name="date_id")
    @NotNull(message= "Date required.")
    @PastOrPresent(message="has to be a date in the past or today's date.")
    private String datePicker;

    @JoinColumn(name="business_name")
    @NotBlank(message= "Name of Business required.")
    @Size(min=1, max= 15, message="Name must be between 1 and 15 characters.")
    private String nameOfBusiness;

    //I don't know if you want this to be a required field, but I added annotation for it, nonetheless.
    //Please double-check also the beverages I chose to put in the Enum class for this item.
    //I know we are basing the search parameters off this, and so some things may need to be added or removed.
    @JoinColumn(name="beverage_type")
    @NotNull(message="Please select a beverage name, or other if unknown.")
    private BeverageName beverageName;

    //Also not sure if this needs to be required.
    @JoinColumn(name="atmosphere_tag")
    @NotNull(message="Please select an atmosphere type, or other if unknown.")
    private Atmosphere atmosphere;

    @JoinColumn(name="overall_rating")
    @NotNull(message="Rating required")
    private OverallRating overallRating;

    //I did not make this required, because we already have multiple required fields that collect a lot of information.
    //But if you want it to be required just add a @NotBlank annotation. :)
    @JoinColumn(name="actual_review_summary")
    @Size(max=1000, message="Review Summary must be 1000 characters or under.")
    private String summary;

    public NewReview(String datePicker, String nameOfBusiness, BeverageName beverageName, Atmosphere atmosphere, OverallRating overallRating, String summary) {
        this.datePicker = datePicker;
        this.nameOfBusiness = nameOfBusiness;
        this.beverageName = beverageName;
        this.atmosphere = atmosphere;
        this.overallRating = overallRating;
        this.summary = summary;
    }

    public NewReview(){}

    public int getId() {
        return id;
    }


    public String getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(String datePicker) {
        this.datePicker = datePicker;
    }

    public String getNameOfBusiness() {
        return nameOfBusiness;
    }

    public void setNameOfBusiness(String nameOfBusiness) {
        this.nameOfBusiness = nameOfBusiness;
    }

    public BeverageName getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(BeverageName beverageName) {
        this.beverageName = beverageName;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public OverallRating getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(OverallRating overallRating) {
        this.overallRating = overallRating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    @Override
    public String toString(){
        return nameOfBusiness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewReview newReview = (NewReview) o;
        return id == newReview.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
