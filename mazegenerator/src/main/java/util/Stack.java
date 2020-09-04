/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author nicholas
 */
public class Stack {

    private int last;
    private Cell[] list;

    public Stack(int size) {
        last = -1;
        list = new Cell[size];

    }

    /**
     *
     * @return cell object from stack
     */
    public Cell pop() {

        Cell cell = list[last];
        last--;
        return cell;

    }

    /**
     *
     * @param cell cell object.
     */
    public void add(Cell cell) {
        last++;
        list[last] = cell;

    }

    /**
     * Check if list is empty or not
     *
     * @return returns Boolean depending from list
     */
    public boolean isEmpty() {

        if (last == -1) {
            return true;
        }
        return false;
    }

}
