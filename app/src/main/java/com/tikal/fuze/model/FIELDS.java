package com.tikal.fuze.model;

import com.tikal.fuze.R;

/**
 * Created by Tikal on 2/27/2017.
 */

public enum Fields {

    workplace(R.string.workclass, R.array.workclass),
    age(R.string.workclass),
    weight(R.string.weight),
    education(R.string.education, R.array.education),
    education_num(R.string.education_num),
    marital_status(R.string.marital_status, R.array.marital_status),
    occupation(R.string.occupation, R.array.occupation),
    relationship(R.string.relationship, R.array.relationship),
    race(R.string.race, R.array.race),
    sex(R.string.sex, R.array.sex),
    capital_gain(R.string.capital_gain),
    capital_loss(R.string.capital_loss),
    hours_per_week(R.string.hours_per_week),
    native_country(R.string.native_country, R.array.native_country);

    public static final int TYPE_SPINNER  = 1;
    public static final int TYPE_VALUE  = 2;

    private int labelRes;

    private int arrayRes = - 1;

    Fields(int labelRes)
    {
        this.labelRes = labelRes;
    }

    Fields(int labelRes, int arrayRes)
    {
        this(labelRes);
        this.arrayRes = arrayRes;
    }

    public int getType()
    {
        return arrayRes == -1 ? TYPE_VALUE : TYPE_SPINNER;
    }

    public int getLabelRes()
    {
        return labelRes;
    }

    public int getArrayRes()
    {
        return arrayRes;
    }

}
