package com.tikal.fuze.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tikal on 2/27/2017.
 */

public class Payload {
    @SerializedName("workplace")
    private String workplace;

    @SerializedName("age")
    private String age;

    @SerializedName("weight")
    private String weight;

    @SerializedName("education")
    private String education;

    @SerializedName("education-num")
    private String education_num;

    @SerializedName("marital-status")
    private String marital_status;

    @SerializedName("occupation")
    private String occupation;

    @SerializedName("relationship")
    private String relationship;

    @SerializedName("race")
    private String race;

    @SerializedName("sex")
    private String sex;

    @SerializedName("capital-gain")
    private String capital_gain;

    @SerializedName("capital-loss")
    private String capital_loss;

    @SerializedName("hours-per-week")
    private String hours_per_week;

    @SerializedName("native-country")
    private String native_country;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCapital_gain() {
        return capital_gain;
    }

    public void setCapital_gain(String capital_gain) {
        this.capital_gain = capital_gain;
    }

    public String getCapital_loss() {
        return capital_loss;
    }

    public void setCapital_loss(String capital_loss) {
        this.capital_loss = capital_loss;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation_num() {
        return education_num;
    }

    public void setEducation_num(String education_num) {
        this.education_num = education_num;
    }

    public String getHours_per_week() {
        return hours_per_week;
    }

    public void setHours_per_week(String hours_per_week) {
        this.hours_per_week = hours_per_week;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getNative_country() {
        return native_country;
    }

    public void setNative_country(String native_country) {
        this.native_country = native_country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
