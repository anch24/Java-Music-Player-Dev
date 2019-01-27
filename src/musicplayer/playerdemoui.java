/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Nan
 */
public class playerdemoui extends javax.swing.JFrame {

    //A treemap data structure for storing playlist songs
    private TreeMap PLAYLIST = new TreeMap();
    
    //A arraylist data structure for storing playlist files
    private ArrayList<List> PLAYLISTFILES = new ArrayList<>();
    
    //A listmodel object for playlist names
    private List PLAYLISTNAMES = new List();
    
    //A playlist object for managing playlist operations
    private PlayList PLOBJ = new PlayList();
    

    /**
     * Creates new form playerdemoui
     */
    public playerdemoui() {
        
        //Scan the database for playlist names and store it in a listmodel object
        PLAYLISTNAMES = PLOBJ.getPlayListNames();
        
        //Scan the database for playlist files using the playlist names stored in listmodel object
        for (int i = 0; i < PLAYLISTNAMES.size(); i++) {
            PLAYLISTFILES.add(PLOBJ.getPlayList(PLAYLISTNAMES.get(i)));
        }
        for (int i = 0; i < PLAYLISTNAMES.size(); i++) {
            PLAYLIST.put(PLAYLISTNAMES.get(i), PLAYLISTFILES.get(i).getList());
        }
        

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tools_panel = new javax.swing.JPanel();
        repeat_btn = new javax.swing.JLabel();
        next_btn = new javax.swing.JLabel();
        pause_btn = new javax.swing.JLabel();
        play_btn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stop_btn = new javax.swing.JLabel();
        prev_btn = new javax.swing.JLabel();
        shuffle_btn = new javax.swing.JLabel();
        current_played = new javax.swing.JLabel();
        header_panel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        playlist_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playlist_list = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        add_playlist_button = new javax.swing.JLabel();
        edit_playlist = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        now_playing_list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("Window"); // NOI18N
        setResizable(false);

        repeat_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeat_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Reset_20px_3.png"))); // NOI18N
        repeat_btn.setToolTipText("Repeat");
        repeat_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        repeat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                repeat_btnMouseReleased(evt);
            }
        });

        next_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_End_25px.png"))); // NOI18N
        next_btn.setToolTipText("Next");
        next_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                next_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                next_btnMouseReleased(evt);
            }
        });

        pause_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pause_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Pause_25px_2.png"))); // NOI18N
        pause_btn.setToolTipText("Pause");
        pause_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        pause_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pause_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pause_btnMouseReleased(evt);
            }
        });

        play_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Play_30px_5.png"))); // NOI18N
        play_btn.setToolTipText("Play");
        play_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                play_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                play_btnMouseReleased(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        stop_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stop_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Stop_25px_2.png"))); // NOI18N
        stop_btn.setToolTipText("Stop");
        stop_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        stop_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stop_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stop_btnMouseReleased(evt);
            }
        });

        prev_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prev_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Skip_to_Start_25px.png"))); // NOI18N
        prev_btn.setToolTipText("Previous");
        prev_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        prev_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prev_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                prev_btnMouseReleased(evt);
            }
        });

        shuffle_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shuffle_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Shuffle_20px_3.png"))); // NOI18N
        shuffle_btn.setToolTipText("Shuffle");
        shuffle_btn.setPreferredSize(new java.awt.Dimension(30, 30));
        shuffle_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shuffle_btnMouseReleased(evt);
            }
        });

        current_played.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        current_played.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        current_played.setText("Select a song to play");
        current_played.setToolTipText("Currently Played Song Goes Here");

        javax.swing.GroupLayout tools_panelLayout = new javax.swing.GroupLayout(tools_panel);
        tools_panel.setLayout(tools_panelLayout);
        tools_panelLayout.setHorizontalGroup(
            tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tools_panelLayout.createSequentialGroup()
                .addGroup(tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tools_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(current_played, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(shuffle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prev_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tools_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(157, 157, 157)))
                .addComponent(stop_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(play_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pause_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(repeat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tools_panelLayout.setVerticalGroup(
            tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tools_panelLayout.createSequentialGroup()
                .addGroup(tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tools_panelLayout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(current_played, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tools_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(play_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pause_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tools_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(repeat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(stop_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shuffle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prev_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("RAY MUSIC PLAYER");

        javax.swing.GroupLayout header_panelLayout = new javax.swing.GroupLayout(header_panel);
        header_panel.setLayout(header_panelLayout);
        header_panelLayout.setHorizontalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_panelLayout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        header_panelLayout.setVerticalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        );

        playlist_list.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        playlist_list.setModel(PLAYLISTNAMES.getList());
        playlist_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        playlist_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlist_listMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playlist_listMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(playlist_list);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 24));

        add_playlist_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_playlist_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_List_20px_1.png"))); // NOI18N
        add_playlist_button.setToolTipText("Add Playlist");
        add_playlist_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add_playlist_buttonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add_playlist_buttonMouseReleased(evt);
            }
        });

        edit_playlist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_playlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Edit_20px.png"))); // NOI18N
        edit_playlist.setToolTipText("Edit Playlist");
        edit_playlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                edit_playlistMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                edit_playlistMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(add_playlist_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(edit_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(add_playlist_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playlist_panelLayout = new javax.swing.GroupLayout(playlist_panel);
        playlist_panel.setLayout(playlist_panelLayout);
        playlist_panelLayout.setHorizontalGroup(
            playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addContainerGap())
        );
        playlist_panelLayout.setVerticalGroup(
            playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        now_playing_list.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        now_playing_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        now_playing_list.setToolTipText("");
        now_playing_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                now_playing_listMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(now_playing_list);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playlist_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tools_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(header_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playlist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tools_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void playlist_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlist_listMouseClicked
        Set set = PLAYLIST.entrySet();
        Iterator t = set.iterator();
        while (t.hasNext()) {
            Map.Entry me = (Map.Entry) t.next();
            if (playlist_list.getSelectedValue().equals(me.getKey().toString())) {
                DefaultListModel model = (DefaultListModel) me.getValue();
                now_playing_list.setModel(model);
            }
        }
    }//GEN-LAST:event_playlist_listMouseClicked

    private void now_playing_listMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_now_playing_listMouseReleased
        if (evt.getClickCount() == 2) {
            
        }
    }//GEN-LAST:event_now_playing_listMouseReleased

    private void play_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_btnMouseReleased
        play_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Play_30px_5.png")));

        
    }//GEN-LAST:event_play_btnMouseReleased

    private void stop_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_btnMouseReleased
        stop_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Stop_25px_2.png")));

        
    }//GEN-LAST:event_stop_btnMouseReleased

    private void pause_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pause_btnMouseReleased
        pause_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Pause_25px_2.png")));
        
    }//GEN-LAST:event_pause_btnMouseReleased

    private void next_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMouseReleased
        next_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_End_25px.png")));
        //PLAYER.next();
    }//GEN-LAST:event_next_btnMouseReleased

    private void prev_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_btnMouseReleased
        prev_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Skip_to_Start_25px.png")));
        //PLAYER.prev();
    }//GEN-LAST:event_prev_btnMouseReleased

    private void shuffle_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shuffle_btnMouseReleased
        
    }//GEN-LAST:event_shuffle_btnMouseReleased

    private void repeat_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeat_btnMouseReleased
        
    }//GEN-LAST:event_repeat_btnMouseReleased

    private void play_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_btnMousePressed
        play_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Play_25px.png")));
    }//GEN-LAST:event_play_btnMousePressed

    private void pause_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pause_btnMousePressed
        pause_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Pause_20px.png")));
    }//GEN-LAST:event_pause_btnMousePressed

    private void stop_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_btnMousePressed
        stop_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Stop_20px.png")));
    }//GEN-LAST:event_stop_btnMousePressed

    private void next_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMousePressed
        next_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_End_20px.png")));
    }//GEN-LAST:event_next_btnMousePressed

    private void prev_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_btnMousePressed
        prev_btn.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Skip_to_Start_20px.png")));
    }//GEN-LAST:event_prev_btnMousePressed

    private void add_playlist_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_playlist_buttonMousePressed
        add_playlist_button.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Add_List_15px.png")));
    }//GEN-LAST:event_add_playlist_buttonMousePressed

    private void add_playlist_buttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_playlist_buttonMouseReleased
        add_playlist_button.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Add_List_20px_1.png")));
        new AddPlayList(this, true, PLAYLISTFILES.get(0).getList()).setVisible(true);
    }//GEN-LAST:event_add_playlist_buttonMouseReleased

    private void edit_playlistMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_playlistMousePressed
        edit_playlist.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Edit_15px.png")));
    }//GEN-LAST:event_edit_playlistMousePressed

    private void edit_playlistMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_playlistMouseReleased
        edit_playlist.setIcon(new ImageIcon(getClass().getResource("/images/icons8_Edit_20px.png")));
    }//GEN-LAST:event_edit_playlistMouseReleased

    private void playlist_listMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlist_listMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_playlist_listMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(playerdemoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playerdemoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playerdemoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playerdemoui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playerdemoui().setVisible(true);
            }
        });
        new Thread() {
            @Override
            public void run() {
                System.out.println("Testing running?");
            }
            
        }.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_playlist_button;
    public static javax.swing.JLabel current_played;
    private javax.swing.JLabel edit_playlist;
    private javax.swing.JPanel header_panel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel next_btn;
    public static javax.swing.JList<String> now_playing_list;
    private javax.swing.JLabel pause_btn;
    private javax.swing.JLabel play_btn;
    private javax.swing.JList<String> playlist_list;
    private javax.swing.JPanel playlist_panel;
    private javax.swing.JLabel prev_btn;
    private javax.swing.JLabel repeat_btn;
    private javax.swing.JLabel shuffle_btn;
    private javax.swing.JLabel stop_btn;
    private javax.swing.JLabel title;
    private javax.swing.JPanel tools_panel;
    // End of variables declaration//GEN-END:variables
}