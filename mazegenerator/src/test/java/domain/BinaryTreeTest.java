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
}
