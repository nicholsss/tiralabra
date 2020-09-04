/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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

    public int getY() {
        return y;
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
    public void setVisited() {
        this.visited = true;
    }

    public void setTop() {
        this.top = false;

    }

    public void setRight() {
        this.right = false;
    }

    public void setLeft() {
        this.left = false;
    }

    public void setBottom() {
        this.bottom = false;
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
    public void removeWalls(Cell next) {
        int col = this.y - next.y;

        if (col == 1) {
            this.setLeft();
            next.setRight();
            //this.left = false;
            //next.right = false;

        } else if (col == -1) {
            this.setRight();
            next.setLeft();
            //  this.right = false;
            // next.left = false;
        }

        int row = this.x - next.x;

        if (row == 1) {
            this.setTop();
            next.setBottom();
            //this.top = false;
            //next.bottom = false;
        } else if (row == -1) {
            this.setBottom();
            next.setTop();
            // this.bottom = false;
            // next.top = false;
        }

    }

}
