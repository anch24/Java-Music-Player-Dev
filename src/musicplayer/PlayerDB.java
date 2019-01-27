/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nan
 */
public class PlayerDB {
    
    private static final String DBNAME = "MusicPlayer.db";
    
    private static final String DBURL = "jdbc:sqlite:C:\\Users\\Nan\\Documents\\NetBeansProjects\\My Project\\MusicPlayer2.0\\db\\";
    
    private Connection CONN;
    
    protected void connect() {
        try {
            CONN = DriverManager.getConnection(DBURL + DBNAME);
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void createTable(String tableName) {
        // SQL statement for inserting a new playlist data
        String sql_add_playlist = "INSERT INTO PlaylistNames(Names) VALUES(?)";

        // Add data on the playlist
        try {
            PreparedStatement pstmt = CONN.prepareStatement(sql_add_playlist);
            pstmt.setString(1, tableName);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
           Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);  
        }

        // SQL statement for creating a new table
        String sql1 = "CREATE TABLE IF NOT EXISTS " + tableName + "(MusicName TEXT NOT NULL)";

        try {
            Statement stmt = CONN.createStatement();
            stmt.execute(sql1);
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void insertDataIntoDefaultList(String musicName, String musicPath) {
        String tableName = "DefaultList";
        String sql = "INSERT INTO " + tableName + "(MusicName, MusicPath) VALUES(?, ?)";
        try {
            PreparedStatement pstmt = CONN.prepareStatement(sql);
            pstmt.setString(1, musicName);
            pstmt.setString(2, musicPath);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void insertDataIntoTable(String tableName, String MusicName) {
        try {
            String sql = "INSERT INTO " + tableName + "(MusicName) VALUES(?)";
            
            PreparedStatement pstmt = CONN.prepareStatement(sql);
            pstmt.setString(1, MusicName);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected List getTableData(String tableName) {
        List musicFiles = new List();
        
        String sql = "SELECT MusicName FROM " + tableName;
        try {
            Statement stmt = CONN.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                musicFiles.add(rs.getString("MusicName"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return musicFiles;
    }
    
    protected List getPlayListNames() {
        List playlistnames = new List();
        String sql = "SELECT Names FROM PlaylistNames";
        try {
            Statement stmt = CONN.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                playlistnames.add(rs.getString("Names"));
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return playlistnames;
    }
}
