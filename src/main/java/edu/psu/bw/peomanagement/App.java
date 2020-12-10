/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.peomanagement;

import Controller.MainViewController;
import Model.DataTableModel;

/**
 *
 * @author hoang
 */
public class App {
    public static void main (String arg[]){
        DataTableModel model = new DataTableModel();
        MainViewController controller = new MainViewController( );
        Mainview view = new Mainview(controller);
        
    }
}
