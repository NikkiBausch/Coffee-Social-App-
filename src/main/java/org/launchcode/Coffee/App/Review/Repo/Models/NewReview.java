package org.launchcode.Coffee.App.Review.Repo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class NewReview {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message= "Date required.")
    private DatePicker datepicker;

    @NotBlank(message= "Name of Business required.")
    @Size(min=1, max= 15, message="Name must be between 1 and 15 characters.")
    private String nameOfBusiness;

    private BeverageName beverageName;

    @Size(max= 500, message = "Description of 'atmosphere' must be under 500 characters or under.")
    private String atmosphere;

    @NotBlank(message="Rating required")
    private OverallRating overallRating;

    @Size(max=1000, message="Review Summary must be 1000 characters or under.")
    private String summary;

    public NewReview(DatePicker datepicker, String nameOfBusiness, BeverageName beverageName, String atmosphere, OverallRating overallRating, String summary) {
        this.datepicker = datepicker;
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


    public DatePicker getDatePicker() {
        return datepicker;
    }

    public void setDatePicker(DatePicker datepicker) {
        this.datepicker = datepicker;
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

    public String getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(String atmosphere) {
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
