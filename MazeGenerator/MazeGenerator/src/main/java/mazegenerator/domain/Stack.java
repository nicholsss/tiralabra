/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

/**
 *
 * @author Nicholas
 */
public class Stack {

    private int last;
    private Cell[] lista;

    public Stack(int koko) {
        last = -1;
        lista = new Cell[koko];

    }
    /**
     * 
     * @return cell object from stack
     */
    public Cell pop() {

        try {
            Cell cell = lista[last];
            last--;
            return cell;
        } catch (Exception e) {
            throw (e);
        }

    }

    public void add(Cell cell) {
        last++;
        lista[last] = cell;

    }

    public boolean isEmpty() {

        if (last == -1) {
            return true;
        }
        return false;
    }

}
