package com.java.swing.ui;

import com.java.swing.product.Product;

import java.util.List;

public class DisplayObjectTableModel extends CustomTableModel<Product> {

    public DisplayObjectTableModel() {
        super();
    }

    public DisplayObjectTableModel(List<Product> rows) {
        super(rows);
    }

    @Override
    protected Object getValueAt(Product product, int columnIndex) {
        Object tmp;
        if (columnIndex == 1) {
            tmp = product.getPrice();
        } else {
            tmp = product.getName();
        }
        return tmp;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        return column==0 ? "Nazwa produktu" : "Cena";
    }
}
