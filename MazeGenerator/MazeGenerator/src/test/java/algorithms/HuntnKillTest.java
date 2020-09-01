/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import mazegenerator.domain.Cell;
import mazegenerator.domain.DfsRec;
import mazegenerator.domain.HuntnKill;
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
public class HuntnKillTest {

    public HuntnKillTest() {
    }

    @Test
    public void cellHasNeighbour() {

        int x = 8;
        int y = 8;
        DfsRec dfs = new DfsRec(x, y);
        HuntnKill hnk = new HuntnKill(x, y);

        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
