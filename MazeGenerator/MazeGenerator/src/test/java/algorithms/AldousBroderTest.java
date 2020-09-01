/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import mazegenerator.domain.AldousBroder;
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
public class AldousBroderTest {

    public AldousBroderTest() {

    }

    public void mazeHasNeighbor() {
        int x = 4;
        int y = 4;
        Cell[][] grid;
        grid = new Cell[x][y];
        AldousBroder ab = new AldousBroder(x, y);

        ab.generateMaze();
    }
}
