/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import ui.Ui;

/**
 *
 * @author Nicholas
 */
public class Main {

    /**
     *
     * @param args Starting
     */
    public static void main(String[] args) {

        int x = 100;
        int y = 100;
        HuntnKill k= new HuntnKill(x, y);
        k.draw();
        //Ui ui = new Ui();
        //ui.start();

    }
}
