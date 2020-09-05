package domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Cell;

public class AldousBroderTest {

    int x = 8;
    int y = 8;

    public AldousBroderTest() {

    }

    @Test
    public void gridContainsCells() {

        AldousBroder ab = new AldousBroder(x, y);

        assertNotNull(ab);
    }

    @Test
    public void gridContainsGeneratedMaze() {
        AldousBroder ab = new AldousBroder(x, y);

        assertNotEquals(ab, ab.generateMaze());
    }

    @Test
    public void cellHasNeighbour() {
        AldousBroder ab = new AldousBroder(x, y);
        Cell grid[][] = ab.generateMaze();
        Cell neighbour = ab.checkNeighbour(grid[0][0]);
        Cell neighbour1 = ab.checkNeighbour(grid[1][1]);
        assertNotNull(neighbour);
        assertNotNull(neighbour1);
    }

    @Test
    public void cellNotHavingAllWalls() {
        AldousBroder ab = new AldousBroder(x, y);

        Cell grid[][] = ab.generateMaze();
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
