/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mazegenerator.domain.ArrayList;
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
public class ArrayListTest {
    
    private ArrayList list;
    
    public ArrayListTest() {
        
    }
    
    @Before
    public void setUp() {
        
        ArrayList<Cell> list = new ArrayList<Cell>();
    }
    
    @Test
    public void ListIsEmpty() {
        assertTrue(list.isEmpty());
    }
    
    @Test
    public void ListNotEmpty() {
        list.add(new Cell(1, 2));
        assertEquals(1, list.size() == 1);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
