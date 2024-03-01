package Week04;

public class Inventory {
    private String customerName;
    private String customerItem;

    @Override
    public String toString() {
        return "Inventory" + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Customer Item: " + customerItem;
    }

    public Inventory(String customerName, String customerItem) {
        this.customerName = customerName;
        this.customerItem = customerItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerItem() {
        return customerItem;
    }

    public void setCustomerItem(String customerItem) {
        this.customerItem = customerItem;
    }


}
