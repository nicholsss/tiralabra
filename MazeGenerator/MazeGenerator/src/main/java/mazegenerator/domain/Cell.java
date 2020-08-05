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
    public void setVisitedt(boolean visited) {
        this.visited = visited;
    }

    /**
     * Metodi tarkistaa mitkä on sen hetkisen Cell olion naapurit, joissa ei
     * olla käyty.
     *
     * @param grid on ruudukko joka sisältää Cell olion jokaisessa paikassaan.
     *
     *
     */
    public Cell CheckNeighbors(List<Cell> grid) {

        List<Cell> neighbours = new ArrayList<Cell>();

        Cell top = NeighbourInGrid(grid, new Cell(x, y - 1));
        Cell right = NeighbourInGrid(grid, new Cell(x + 1, y));
        Cell bottom = NeighbourInGrid(grid, new Cell(x, y + 1));
        Cell left = NeighbourInGrid(grid, new Cell(x - 1, y));
        /*
        
        Cell top = new Cell(x, y - 1);
        Cell right = new Cell(x + 1, y);
        Cell bottom = new Cell(x, y + 1);
        Cell left = new Cell(x - 1, y);
         */
        if (top != null) {
            if (!top.visited) {
                neighbours.add(top);
            }
        }

        if (right != null) {
            if (!right.visited) {
                neighbours.add(right);
            }
        }
        if (bottom != null) {
            if (!right.visited) {
                neighbours.add(bottom);
            }
        }
        if (left != null) {
            if (!left.visited) {
                neighbours.add(left);
            }
        }

        if (neighbours.size() > 0) {
            return randomNeighbour(neighbours);
        }
        return null;
    }

    /**
     * Metodin tarkoitus on tarkistaa että saatu current Cell ei etsi naapuria
     * gridin ulkopuolelta.
     */
    private Cell NeighbourInGrid(List<Cell> grid, Cell cell) {

        if (grid.contains(cell)) {
            return grid.get(grid.indexOf(cell));
        } else {
            return null;
        }

    }

    private Cell randomNeighbour(List<Cell> neighbours) {
        if (neighbours.size() > 0) {
            return neighbours.get(new Random().nextInt(neighbours.size()));
        } else {
            return null;
        }
    }

}
