/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator.domain;

/**
 *
 * @author Nicholas
 */
public class MazeService {

    private DfsRec dfs;

    public MazeService() {

    }

    public Cell[][] CreateMaze(int x, int y) {
        dfs = new DfsRec(x, y);
        
        return dfs.getGrid();
    }
}
