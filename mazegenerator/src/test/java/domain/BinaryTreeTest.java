/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Cell;

/**
 *
 * @author nicholas
 */
public class BinaryTreeTest {

    int x = 8;
    int y = 8;

    public BinaryTreeTest() {
    }

    @Test
    public void gridNotEmptyTest() {

        BinaryTree bt = new BinaryTree(x, y);

        assertNotNull(bt);
    }

    @Test
    public void mazeIsGeneratedTest() {

        BinaryTree bt = new BinaryTree(x, y);

        assertNotEquals(bt, bt.generateMaze());

    }

    @Test
    public void cellHasNeighbourTest() {

        BinaryTree bt = new BinaryTree(x, y);
        Cell current = bt.getCellFromGrid(1, 1);
        bt.checkNeighbour(current);

    }

    @Test
    public void correctCellFromGrid() {
        BinaryTree bt = new BinaryTree(x, y);
        Cell current = bt.getCellFromGrid(1, 1);

        assertEquals(current, bt.getCellFromGrid(1, 1));
    }
    
     @Test
    public void cellNotHavingAllWalls() {
        BinaryTree bt = new BinaryTree(x, y);

        Cell grid[][] = bt.generateMaze();
        boolean walledCell = true;
         for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (grid[i][j].getTop() == true && grid[i][j].getRight() == true && grid[i][j].getBottom() == true && grid[i][j].getLeft() == true) {
                    walledCell = false;
                }
            }
        }
        assertTrue(walledCell);
    }
}
