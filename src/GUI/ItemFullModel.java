package GUI;

import dbo.*;
import javax.swing.table.AbstractTableModel;

public class ItemFullModel extends AbstractTableModel {

    Items items = null;

    public ItemFullModel(Items items) {
        this.items = items;
    }

    public Items getItems() {
        return items;
    }

    public int getRowCount() {
        return items.size();
    }

    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Code";
                break;
            case 1:
                columnName = "Name";
                break;
            
            case 2:
                columnName = "Unit";
                break;
            case 3:
                columnName = "Price";
                break;
            
        }
        return columnName;
    }
    
    @Override
    public Object getValueAt(int row, int column){
        Item item = items.get(row);
        Object obj = null;
        switch(column){
            case 0:
                obj = item.getItemCode();
                break;
            case 1:
                obj = item.getItemName();
                break;
          
            case 2:
                obj = item.getUnit();
                break;
            case 3: 
                obj = item.getPrice();
                break;
           
        }
        return obj;
    }
}
