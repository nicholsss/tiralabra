/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class CellTest {
    
    public CellTest() {
        
    }
    
   @Test
    public void CellHasXAndY(){
        Cell cell = new Cell(3,4);
        
        int x = cell.getX();
        int y = cell.getY();
        
        assertEquals(3, x);
        assertEquals(4, y);
    }
    
    @Test
    public void removeWall(){
       Cell cell = new Cell(2,2); 
       
       cell.setTop();
       
        assertTrue(cell.getTop());
        assertEquals(cell.getTop(), false);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
