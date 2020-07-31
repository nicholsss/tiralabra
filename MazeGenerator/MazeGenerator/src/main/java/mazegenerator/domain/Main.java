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
    public static void main(String[] args) {
        int x = 6;
        int y = 6;
        
        DFS dfs = new DFS(x,y);
        //dfs.GenerateMaze(10, 10);
    }
}
