/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import mazegenerator.domain.Cell;
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
public class StackTest {

    public StackTest() {
    }

    @Test
    public void testGetPop() {
        Stack stack = new Stack(5 * 5);

        Cell cell = new Cell(1, 1);
        Cell cell1 = new Cell(2, 2);
        Cell cell2 = new Cell(3, 3);
        stack.add(cell);
        stack.add(cell1);
        stack.add(cell2);
        Cell c = stack.pop();
        assertEquals(c.getX(), 3);
        assertEquals(c.getY(), 3);

    }

    @Test
    public void testStackIsEmpty() {
        Stack stack = new Stack(5 * 5);

        Cell cell = new Cell(1, 1);
        Cell cell1 = new Cell(2, 2);
        Cell cell2 = new Cell(3, 3);
        stack.add(cell);
        stack.add(cell1);
        stack.add(cell2);

        stack.pop();
        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());

    }

}
