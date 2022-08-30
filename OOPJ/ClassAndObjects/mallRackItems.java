package ClassAndObjects;

class Products{
    private String ItemNo;
    private String ProductName;
    private float price;
    private int quantity;

    // Here Item Number, Product Name will assign on construction time. No need to set their price frequently that should be same
    Products(String ItemNo, String ProductName){
        this.ItemNo = ItemNo;
        this.ProductName = ProductName;
    }

    // Getter methods
    public String getItemNo() {
        return ItemNo;
    }

    public float getPrice(){
        return price;
    }

    public String getProductName(){
        return ProductName;
    }

    public int getQty(){
        return quantity;
    }

    // Setter methods
    public void setPrice(float Price){
        price = Price;
    }

    public void setQuantity(int Qty){
        quantity = Qty;
    }

    /* public String ShowProductDetails(){
        return "Name: "+getProductName()+"\nItem No.: "+getItemNo()+"\nPrice of Product: "+getPrice()+"\nTotal Quantity: "+getQty();
    } */
}

public class mallRackItems {
    public static void main(String[] args) {
        Products process = new Products("AEYT99", "FOGG Perfume");
        process.setPrice(260);
        process.setQuantity(80);
        System.out.println("Name: "+process.getProductName()+"\nItem No.: "+process.getItemNo()+"\nPrice of Product: "+process.getPrice()+"\nTotal Quantity: "+process.getQty());
        // System.out.println(process.ShowProductDetails());
    }
}
