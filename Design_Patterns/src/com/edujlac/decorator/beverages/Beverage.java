package com.edujlac.decorator.beverages;

public abstract class Beverage {
    private String description = "Unknown beverage";
    private Size size = Size.MEDIUM;

    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
