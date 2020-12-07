/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.peomanagement;

import Controller.MainViewController;

/**
 *
 * @author hoang
 */
public class App {
    public static void main (String arg[]){
        MainViewController controller = new MainViewController();
        Mainview view = new Mainview(controller);
    }
}
