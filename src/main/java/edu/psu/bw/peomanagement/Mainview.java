/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.peomanagement;

import Controller.MainViewController;
import Model.DataTableModel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


/**
 *
 * @author hoang
 */
public class Mainview extends JFrame implements Observer, TableModelListener {
    JPanel titlepanel;
    JScrollPane tablepanel;
    JPanel buttonpanel;
    JButton imporbutton;
    JTable table;
    DataTableModel tableModel;
   
    MainViewController controller;
    
    public Mainview(MainViewController c){
        this.controller = c;
        this.controller.addObserver(this);
        this.tableModel = new DataTableModel();
        this.tableModel.addTableModelListener(this);
        this.setSize(800, 600);
        this.setTitle("PEO Management ");
        this.initView();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void initView (){
        this.titlepanel = new JPanel();
        this.tablepanel= new JScrollPane();
        this.buttonpanel= new JPanel();
        JPanel container = new JPanel();
        
    JLabel title= new JLabel ("PEOManagement trial");
    title.setFont(new Font("Serif", Font.BOLD, 16));
    this.titlepanel.add(title);
    
    container.setLayout(new BorderLayout());
    container.add( this.tablepanel, BorderLayout.CENTER);
    container.add(this.buttonpanel, BorderLayout.EAST);
    
    this.imporbutton = new JButton("import");
    this.buttonpanel.add(this.imporbutton);
    this.imporbutton.addActionListener(this.controller);
    
    this.table = new JTable();
    this.table.setModel(this.tableModel);
    this.tablepanel = new JScrollPane(this.table);
    table.setFillsViewportHeight(true);
    
    this.setLayout(new BorderLayout());
    this.add(this.titlepanel, BorderLayout.NORTH);
    this.add(container, BorderLayout.CENTER);
    }

    @Override
    public void update(Observable o, Object arg) {
//        System.out.println("CSV done");
        ArrayList<String> data = this.controller.getImportedData();
        this.tableModel.setData(data);
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        System.out.println("table data has changed");
    }

 
}
