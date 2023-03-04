package model;

public class Ingredient {

    //123

    private String name;
    private int amountNumber;
    private String measureUnit;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountNumber() {
        return amountNumber;
    }

    public void setAmountNumber(int amountNumber) {
        this.amountNumber = amountNumber;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
