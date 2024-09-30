package Models;

public class Chef extends Staff{
    private ChefLevel chefLevel;

    public ChefLevel getChefLevel() {
        return chefLevel;
    }

    public void setChefLevel(ChefLevel chefLevel) {
        this.chefLevel = chefLevel;
    }
}
