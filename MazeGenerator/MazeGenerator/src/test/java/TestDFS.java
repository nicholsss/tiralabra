/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mazegenerator.domain.Cell;
import mazegenerator.domain.DfsRec;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicholas
 */
public class TestDFS {

    /**
     * Test
     */
    public TestDFS() {

    }

    public void testNewMaze() {
        int x = 8;
        int y = 8;
        DfsRec dfs = new DfsRec(x, y);

        dfs.GenerateMaze();

    }

    /**
     * Testing that Cells are not visited
     */
    @Test
    public void testCellNotVisited() {
        int x = 4;
        int y = 4;
        Cell cell = new Cell(x, y);

        assertEquals(cell.getVisited(), false);

    }

    /**
     * Testing that grid is not empty
     */
    @Test
    public void testGridIsNotEmpty() {
        int x = 8;
        int y = 8;

        DfsRec dfs = new DfsRec(x, y);

        assertNotNull(dfs);

    }

}
