package dbo;

public class Item {
    String itemCode = "", itemName = "";
    String unit = "";
    int price = 0;
  

    public Item() {
    }
    
    public Item(String itemCode, String itemName, 
            String unit, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unit = unit;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
