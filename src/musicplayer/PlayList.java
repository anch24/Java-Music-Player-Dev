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
public class PlayList extends PlayerDB{
    
    @Override
    public List getPlayListNames() {
        connect();
        return super.getPlayListNames();
    }
    
    public List getPlayList(String playlistName) {
        List defaultList = new List();
        connect();
        
        return getTableData(playlistName);
    }
}
