package com.java.swing.ui;

import com.java.swing.product.Product;
import com.java.swing.util.DataGenerator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private static final String APP_TITLE = "Test Swing App";
    private JPanel mainPanel;
    private JTable productTable;
    private JSplitPane mainSplitPane;
    private JPanel buttonPanel;
    private JPanel tablePanel;
    private JButton addProductButton;

    private DisplayObjectTableModel productModel;
    private List<Product> list;

    public MainFrame() {
        setMinimumSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(APP_TITLE);
        add(mainPanel);
        addProductButton.addActionListener(this::addProductButtonActionPerformed);
    }

    private void addProductButtonActionPerformed(ActionEvent actionEvent) {
        //JOptionPane.showMessageDialog( this, "Test message");
        list.add(new Product("Komputer", 3478));
        productModel.fireTableDataChanged();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        productTable = new JTable(new DisplayObjectTableModel(DataGenerator.getProductData()));
        list = new ArrayList<>();
        productModel = new DisplayObjectTableModel(list);
        productTable = new JTable(productModel);
    }
}
