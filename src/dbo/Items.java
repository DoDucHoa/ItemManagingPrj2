package dbo;

import java.util.Vector;
import java.sql.*;
import javax.swing.JOptionPane;

public class Items extends Vector<Item>{


    public Items() {
    }
    
    public int find(String itemCode){
        for (int i = 0; i < this.size(); i++) {
            if(itemCode.equals(this.get(i).getItemCode()))
                return i;
        }
        return -1;
    }
    
    public Item findItem(String itemCode){
        int i = find(itemCode);
        return i < 0 ? null : this.get(i);
    }
    
    public void loadFromDB(ItemDBAccess dBObj){
        String itemCode, itemName, unit;
        int price; 
        
        String sql = "";
            sql = "select * from Items";
        try {
            ResultSet rs = dBObj.executeQuery(sql);
            while(rs.next()){
                itemCode = rs.getString(1);   //lưu ý phần này để sửa
                itemName = rs.getString(2);
                unit = rs.getString(3);
                price = rs.getInt(4);
                
                Item item = new Item(itemCode, itemName, unit, price);
                this.add(item);
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
