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
public class DfsRecTest {

    int x = 8;
    int y = 8;

    public DfsRecTest() {

    }

    @Test
    public void gridNotEmptyTest() {
        DfsRec dfs = new DfsRec(x, y);

        assertNotNull(dfs);
    }

    @Test
    public void mazeIsGenerated() {
        DfsRec dfs = new DfsRec(x, y);

        assertNotEquals(dfs, dfs.generateMaze());

    }

    @Test
    public void cellHasNeighbor() {

        DfsRec dfs = new DfsRec(x, y);

        Cell grid[][] = dfs.getGrid();

        Cell neighbor = dfs.checkValidNeighbours(grid[1][1]);

        assertNotNull(neighbor);
    }

    @Test
    public void allCellsVisited() {
        DfsRec dfs = new DfsRec(x, y);
        Cell grid[][] = dfs.generateMaze();

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
        DfsRec dfs = new DfsRec(x, y);

        Cell grid[][] = dfs.generateMaze();
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
