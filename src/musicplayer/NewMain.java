/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.util.ArrayList;

/**
 *
 * @author Nan
 */
public class NewMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PlayerDB playerDB = new PlayerDB();
        playerDB.connect();
        playerDB.insertDataIntoTable("DefaultList", 0);*/
        //playerDB.createTable("SamplePlaylist");
       PlayerDB pl = new PlayerDB();
       pl.connect();
       pl.createTable("RaffyShit");
       pl.insertDataIntoTable("RaffyShit", "Happy Song");
    }
  
    
    
    
    
}
