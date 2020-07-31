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
public class Main {

    /**
     *
     * @param args ohjelman käynnistyminen
     */
    public static void main(String[] args) {
        int x = 2;
        int y = 4;

        DFS dfs = new DFS(x, y);
        //dfs.GenerateMaze(10, 10);
    }
}
