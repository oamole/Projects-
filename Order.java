package superclass;

public class Order{
    private int orderID;
    private String customerID;
    private String productID;
    private String orderDate;
    private int orderAmount;
    private static int count = 100;


    // default constructor
    public Order(){
        this.setCustomerID("No Customer ID");
        this.setProductID("No Product ID");
        this.setOrderDate("01/01/2000");
        this.setOrderAmount(0);
        this.orderID = this.count;
        this.count++;

    }
    // Non-default constructor
    public Order(String customer,String product, String date, int amount){
        this.setCustomerID(customer);
        this.setProductID(product);
        this.setOrderDate(date);
        this.setOrderAmount(amount);
        this.orderID = this.count;
        this.count++;
    }

    // accessors
    public int getOrderID(){
        return this.orderID;
    }
    public String getCustomerID(){
        return this.customerID;
    }
    public String getProdcutID(){
        return this.productID;
    }
    public String getOrderDate(){
        return this.orderDate;
    }
    // Order amount might be redundant.
    public int getOrderAmount(){
        return this.orderAmount;
    }

    // mutators
    public void setOrderID(int oID){
        this.orderID = oID;
    }
    public void setCustomerID(String cID){
        this.customerID = cID;
    }
    public void setProductID(String pID){
        this.productID = pID;
    }
    public void setOrderDate(String date){
        this.orderDate = date;
    }
    public void setOrderAmount(int amount){
        this.orderAmount = amount;
    }

    public String toString(){
        String str = "";
        str += "Order ID: " + this.getOrderID() + "\n";
        str += "Customer ID: " + this.getCustomerID() + "\n";
        str += "Product ID: " + this.getProdcutID() + "\n";
        str += "Date of Order (mm/dd/yyyy): " + this.getOrderDate() + "\n";
        str += "Order amount: " + this.getOrderAmount() + "\n";

        return str;
    }
}
