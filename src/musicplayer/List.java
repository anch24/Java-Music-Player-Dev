/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import javax.swing.DefaultListModel;

/**
 *
 * @author Nan
 */
public class List {
    
    private final DefaultListModel LIST;

    public List() {
        this.LIST = new DefaultListModel();
    }
    
    public void add(String element) {
        if (element.length() > 0) {
            this.LIST.addElement(element);
        }
    }
    
    public String get(int idx) {
        return (String) this.LIST.get(idx);
    }
    
    public int size() {
        return this.LIST.getSize();
    }
    
    public DefaultListModel getList() {
        return this.LIST;
    }
}
