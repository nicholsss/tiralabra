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
 *
 * Cell class has values of cell x and y values, it also contains values about
 * cell walls Cell has value visited, which tells if that current cell is
 * visited.
 *
 * @author Nicholas
 */
public class Cell {

    private int x;
    private int y;
    private boolean visited;
    private boolean top;
    private boolean right;
    private boolean bottom;
    private boolean left;

    /**
     *
     * @param x is rows
     * @param y is columns
     */
    public Cell(int x, int y) {

        this.x = x;
        this.y = y;
        this.visited = false;
        this.top = true;
        this.right = true;
        this.bottom = true;
        this.left = true;
    }

    /**
     *
     * @return cell value x
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param change value of x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return cell value y
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param change value of y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @return cell visited value.
     */
    public boolean getVisited() {
        return visited;
    }

    /**
     * Change visited Boolean to true
     *
     */
    public void setVisitedt() {
        this.visited = true;
    }

    public void setTop() {
        this.top = false;

    }

    public void setLeft() {
        this.left = false;
    }

    public boolean getTop() {
        return top;
    }

    public boolean getRight() {
        return right;
    }

    public boolean getBottom() {
        return bottom;
    }

    public boolean getLeft() {
        return left;
    }

    /**
     * minus current cell x value, from next cell x value. Depending from
     * outcome we delete left and right wall, and vice-versa when we get -1.
     * Same goes with y value.
     *
     * @param next
     */
    void removeWalls(Cell next) {
        int x = this.x - next.x;

        if (x == 1) {
            this.left = false;
            next.right = false;

        } else if (x == -1) {
            this.right = false;
            next.left = false;
        }

        int y = this.y - next.y;

        if (y == 1) {
            this.top = false;
            next.bottom = false;
        } else if (y == -1) {
            this.bottom = false;
            next.top = false;
        }

    }

}
