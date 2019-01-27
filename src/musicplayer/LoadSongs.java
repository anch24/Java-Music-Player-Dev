/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nan
 */
public class LoadSongs extends PlayerDB{
    
    private String SONGPATH;
    
    private ArrayList<String>SongFiles = new ArrayList<>();
    
    private ArrayList<String>SongPaths = new ArrayList<>();
    
    public LoadSongs() {
    }
    
    public void setSongPath(String songPath) {
        if (songPath.length() > 0) {
            this.SONGPATH = songPath;
        }
    }
    
    public void scanSongs() {
        this.scanFileNames();
        this.scanFilePath();
        
        connect();
        for (int i = 0; i < SongFiles.size(); i++) {
            insertDataIntoDefaultList(SongFiles.get(i), SongPaths.get(i));
        }
        //Display message when database data is updated
        System.out.println("Songs Scanned Successfully.");
    }
    
    public ArrayList<String> getSongFiles() {
        return this.SongFiles;
    }
    
    public ArrayList<String> getSongPaths() {
        return this.SongPaths;
    }
    
    private void scanFileNames() {
        ArrayList<String> Mp3Files = new ArrayList<>();

        //The parentdirectory
        File fileDirectory = new File(SONGPATH);

        //File filter object 
        FilenameFilter filter = (File file, String string) -> string.endsWith(".mp3");
        
        for (File file : fileDirectory.listFiles()) {
            //If there is sub directory
            if (file.isDirectory()) {
                //faulty here directory
                File filetmp = new File("C://Users/Nan/Music/" + file.getName());
                SongFiles.addAll(Arrays.asList(filetmp.list(filter)));
            }

        }

        SongFiles.addAll(Arrays.asList(fileDirectory.list(filter)));

        
    }
    
    private void scanFilePath() {
        ArrayList<String> Mp3Files = new ArrayList<>();

        //The parentdirectory
        File fileDirectory = new File(SONGPATH);

        //File filter object
        FilenameFilter filter = (File file, String string) -> string.endsWith(".mp3");

        for (File file : fileDirectory.listFiles()) {
            //If there is sub directory
            if (file.isDirectory()) {
                //faulty here directory
                File filetmp = new File("C://Users/Nan/Music/" + file.getName());
                //Filter the mp3 files
                File[] fl = filetmp.listFiles(filter);
                for (File f : fl) {
                    SongPaths.add(f.getAbsolutePath());
                }
            }

        }
        
        //Filter the parent directory
        File[] fl = fileDirectory.listFiles(filter);
        for (File f : fl) {
            SongPaths.add(f.getAbsolutePath());
        }

    }
}
