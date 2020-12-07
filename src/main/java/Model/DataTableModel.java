/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hoang
 */
public class DataTableModel extends AbstractTableModel{
    private String[] columnNames;
    private String[][] data;
    
    
    public  DataTableModel(){
        this.data = null;
        this.columnNames = new String[]{"UID", "Program", "Code", "Description", "Amount Provide"};
        
    }
    public void setData(ArrayList<String> data){
        
        String[] array = data.toArray(new String[data.size()]);
        this.data= new String[data.size()/5][5];
        
        for (int i=0; i< data.size()/5; i++){
            for(int j=0; j<5; j++){
                this.data[i][j]= array[i*5+j];
                System.out.println(this.data[i][j]);
            }
        }
    }

    @Override
    public int getRowCount() {
        if(this.data != null){
            
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
       return this.columnNames.length;
    }
     @Override
     public String getColumnName(int col){
         return columnNames[col];
     }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if( this.data !=null ){
            return this.data[rowIndex][columnIndex];
        }
        return null;
    }
    
  
    
}
