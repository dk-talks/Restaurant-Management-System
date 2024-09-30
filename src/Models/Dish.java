package Models;

import java.util.List;

public class Dish extends BaseModel{
    private String name;
    private String description;
    private double price;
    private DishType dishType;
    private String reciepie;
    private List<Ingridient> ingridientList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    public String getReciepie() {
        return reciepie;
    }

    public void setReciepie(String reciepie) {
        this.reciepie = reciepie;
    }

    public List<Ingridient> getIngridientList() {
        return ingridientList;
    }

    public void setIngridientList(List<Ingridient> ingridientList) {
        this.ingridientList = ingridientList;
    }
}
