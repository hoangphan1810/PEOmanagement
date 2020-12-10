/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observable;
import javax.swing.text.View;

/**
 *
 * @author hoang
 */
public class MainViewController extends Observable implements ActionListener {
    ArrayList<String> data;
    
   
    
    public MainViewController(){
        this.data = new ArrayList<>();  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("import")) {
            this.importCmd();
        }
    }

    private void importCmd() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("/txt/PEOSHIPSAMPHIB.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            ArrayList<String> list;
            while ((line = reader.readLine()) != null) {
                list = new ArrayList<String>(Arrays.asList(line.split(",")));
                this.data.addAll(list);
        }
    }catch (IOException ex) {
            System.out.println(ex.getMessage());
    }
    this.CSVDataChanged();
}
    public ArrayList<String> getImportedData(){
        return this.data;
    }
    
    
    
    private void CSVDataChanged(){
        this.setChanged();
        this.notifyObservers();
    }
}
