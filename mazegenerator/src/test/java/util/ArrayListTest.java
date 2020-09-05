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
public class ArrayListTest {

    public ArrayListTest() {

    }

    @Test
    public void listIsEmptyTest() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void listNotEmptyTest() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        list.add(new Cell(1, 2));
        assertEquals(1, list.size());

    }

    @Test
    public void listContainsMultipleCellTest() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        for (int i = 0; i < 15; i++) {
            list.add(new Cell(i, 1));
        }
        assertEquals(15, list.size());
    }

    @Test
    public void getValueFromListTest() {
        ArrayList<Cell> list = new ArrayList<Cell>();
        Cell c = new Cell(0, 1);
        list.add(c);
        list.add(new Cell(0, 2));
        Cell c1 = list.get(0);
        assertEquals(c, c1);
       

    }

}
