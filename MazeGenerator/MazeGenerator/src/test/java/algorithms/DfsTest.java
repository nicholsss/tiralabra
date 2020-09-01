/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

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
 * @author nicholas
 */
public class DfsTest {

    public DfsTest() {
    }

    @Test
    public void mazeContainCellTest() {
        int x = 8;
        int y = 8;
        DfsRec dfs = new DfsRec(x, y);
        dfs.generateMaze();
        Cell k[][] = dfs.getGrid();
        assertNotNull(k[0][0]);

    }

    @Test
    public void mazeNotEmptyTest() {
        int x = 8;
        int y = 8;
        DfsRec dfs = new DfsRec(x, y);

        assertNotNull(dfs);

    }
}
