package com.tikal.fuze.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(suppressConstructorProperties = true)
@Getter
@Setter
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
    private String educationNum;

    @SerializedName("marital-status")
    private String maritalStatus;

    @SerializedName("occupation")
    private String occupation;

    @SerializedName("relationship")
    private String relationship;

    @SerializedName("race")
    private String race;

    @SerializedName("sex")
    private String sex;

    @SerializedName("capital-gain")
    private String capitalGain;

    @SerializedName("capital-loss")
    private String capitalLoss;

    @SerializedName("hours-per-week")
    private String hoursPerWeek;

    @SerializedName("native-country")
    private String nativeCountry;

}
