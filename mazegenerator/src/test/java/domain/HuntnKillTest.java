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
public class HuntnKillTest {

    int x = 8;
    int y = 8;

    public HuntnKillTest() {
    }

    @Test
    public void gridNotEmptyTest() {
        HuntnKill hnk = new HuntnKill(x, y);

        assertNotNull(hnk);
    }

    @Test
    public void mazeIsGenerated() {
        HuntnKill hnk = new HuntnKill(x, y);

        assertNotEquals(hnk, hnk.generateMaze());

    }

    @Test
    public void cellHasNeighbor() {

        HuntnKill hnk = new HuntnKill(x, y);

        Cell grid[][] = hnk.getGrid();

        Cell neighbor = hnk.checkValidNeighbours(grid[1][1]);

        assertNotNull(neighbor);
    }

    @Test
    public void allCellsVisited() {
        HuntnKill hnk = new HuntnKill(x, y);
        Cell grid[][] = hnk.generateMaze();

        boolean visited = true;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {

                if (grid[i][j].getVisited() == false) {
                    visited = false;
                }
            }
        }
        assertTrue(visited);
    }

    @Test
    public void cellNotHavingAllWalls() {
        HuntnKill hnk = new HuntnKill(x, y);

        Cell grid[][] = hnk.generateMaze();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
