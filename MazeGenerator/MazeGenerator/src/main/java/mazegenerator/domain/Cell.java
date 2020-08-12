/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Nicholas
 */
/**
 *
 * Cell luokka pitää kirjaa jokaisen Cell X,Y arvosta, Visited katsoo että onko
 * siinä käyty, neighbors pitää listaa naapureista ja jokaisella Cell on seinät
 *
 * @author Nicholas
 */
public class Cell {

    private int x;
    private int y;
    private boolean visited;

    // private List<Cell> neighbors;
    private boolean[] walls = {true, true, true, true};

    /**
     *
     * @param x saatu x arvo
     * @param y saatu y arvo
     */
    public Cell(int x, int y) {

        this.x = x;
        this.y = y;
        this.visited = false;
        this.walls = walls;
    }

    /**
     *
     * @return palauttaa Cell arvon
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x muokataan x arvo
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return palauttaa Cell Y arvon
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y Muokkaa Cell y arvoa.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return Palauttaa Cell arvon siitä onko siinä käyty.
     */
    public boolean getVisited() {
        return visited;
    }

    /**
     * Voidaaan muokata Cell käynti booleania.
     *
     * @param visited Cell tieto käynnistä
     */
    public void setVisitedt() {
        this.visited = true;
    }


}
