package Models;

public class Bill extends BaseModel {
    private Order order;
    private double revenueFromFoodSales;
    private double gst;
    private double serviceCharge;
    private double totalAmount;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getRevenueFromFoodSales() {
        return revenueFromFoodSales;
    }

    public void setRevenueFromFoodSales(double revenueFromFoodSales) {
        this.revenueFromFoodSales = revenueFromFoodSales;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
