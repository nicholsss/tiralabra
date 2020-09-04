/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class CellTest {

    public CellTest() {
    }

    @Test
    public void cellHasXAndYTest() {
        Cell cell = new Cell(3, 4);

        int x = cell.getX();
        int y = cell.getY();

        assertEquals(3, x);
        assertEquals(4, y);
    }

    @Test
    public void removeWallTest() {
        Cell cell = new Cell(2, 2);

        cell.setTop();

        assertEquals(cell.getTop(), false);

    }

    @Test
    public void removeAllWallsTest() {

        Cell cell = new Cell(2, 2);

        cell.setTop();
        cell.setRight();
        cell.setBottom();
        cell.setLeft();

        assertEquals(cell.getTop(), false);
        assertEquals(cell.getRight(), false);
        assertEquals(cell.getBottom(), false);
        assertEquals(cell.getLeft(), false);
    }

    @Test
    public void cellHasWallsTest() {
        Cell cell = new Cell(0, 0);

        assertEquals(cell.getTop(), true);
        assertEquals(cell.getRight(), true);
        assertEquals(cell.getBottom(), true);
        assertEquals(cell.getLeft(), true);

    }

    @Test
    public void cellIsVisitedTest() {
        Cell cell = new Cell(2, 1);

        cell.setVisited();
        assertEquals(cell.getVisited(), true);
    }

    @Test
    public void removeWallsTest() {
        Cell cell = new Cell(0, 0);
        Cell cell1 = new Cell(0, 1);

        Cell cell2 = new Cell(0, 1);
        Cell cell3 = new Cell(1, 1);

        cell.removeWalls(cell1);
        cell1.removeWalls(cell);

        cell2.removeWalls(cell3);
        cell3.removeWalls(cell2);
        assertEquals(cell.getRight() == false, cell1.getLeft() == false);
        assertEquals(cell.getLeft() == false, cell1.getRight() == false);

        assertEquals(cell2.getTop() == true, cell3.getTop() == false);
        assertEquals(cell3.getTop() == false, cell2.getBottom() == false);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
