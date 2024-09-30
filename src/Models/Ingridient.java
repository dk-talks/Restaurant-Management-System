package Models;

public class Ingridient extends BaseModel {
    private String name;
    private IngridientViscocity ingridientViscocity;
    private IngridientMeasurementUnit ingridientMeasurementUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngridientViscocity getIngridientViscocity() {
        return ingridientViscocity;
    }

    public void setIngridientViscocity(IngridientViscocity ingridientViscocity) {
        this.ingridientViscocity = ingridientViscocity;
    }

    public IngridientMeasurementUnit getIngridientMeasurementUnit() {
        return ingridientMeasurementUnit;
    }

    public void setIngridientMeasurementUnit(IngridientMeasurementUnit ingridientMeasurementUnit) {
        this.ingridientMeasurementUnit = ingridientMeasurementUnit;
    }
}
