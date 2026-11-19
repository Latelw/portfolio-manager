package com.pluralsight;

import java.math.BigDecimal;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, int bedrooms, int squareFeet, int yearBuilt) {
        super(name);
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public BigDecimal getValue() {
        return super.getValue();
    }
}
