/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

import java.util.List;

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

    private List<Cell> neighbors;
    private boolean[] walls = {true, true, true, true};

    public Cell(int x, int y) {

        this.x = x;
        this.y = y;
        this.visited = false;
        this.walls = walls;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVisitedt(boolean visited) {
        this.visited = visited;
    }

    /**
     * Metodin tarkoitus on tarkistaa että saatu current Cell ei etsi naapuria
     * gridin ulkopuolelta.
     */
    public void NeighbourInGrid() {

    }

    /**
     * Metodi tarkistaa mitkä on sen hetkisen Cell olion naapurit, joissa ei
     * olla käyty.
     *
     * @param grid on ruudukko joka sisältää Cell olion jokaisessa paikassaan.
     *
     *
     */
    public void CheckNeighbors(Cell[][] grid) {
// Overflow tässä, muuta tätä.
        Cell top = grid[x][y - 1];
        Cell right = grid[x + 1][y];
        Cell bottom = grid[x][y + 1];
        Cell left = grid[x - 1][y];

        if (!top.visited) {
            neighbors.add(top);
        }
        if (!right.visited) {
            neighbors.add(right);
        }
        if (!bottom.visited) {
            neighbors.add(bottom);
        }
        if (!left.visited) {
            neighbors.add(left);
        }

    }

}
