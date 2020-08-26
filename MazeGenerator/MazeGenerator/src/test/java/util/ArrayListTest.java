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
import util.ArrayList;

/**
 *
 * @author nicholas
 */
public class ArrayListTest {

    public ArrayListTest() {

    }

    @Test
    public void testListIsEmpty() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testListNotEmpty() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        list.add(new Cell(1, 2));
        assertEquals(1, list.size());

    }

    @Test
    public void testListContainsMultipleCell() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        for (int i = 0; i < 10; i++) {
            list.add(new Cell(i, 1));
        }
        assertEquals(10, list.size());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
