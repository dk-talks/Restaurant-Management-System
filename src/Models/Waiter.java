package Models;

public class Waiter extends BaseModel{
    private String name;
    private String email;
    private String phoneNumber;
    private WaiterLevel waiterLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public WaiterLevel getWaiterLevel() {
        return waiterLevel;
    }

    public void setWaiterLevel(WaiterLevel waiterLevel) {
        this.waiterLevel = waiterLevel;
    }
}
