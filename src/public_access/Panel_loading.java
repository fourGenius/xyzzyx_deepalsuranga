/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

import javax.swing.JPanel;

/**
 *
 * @author deepalsuranga
 */
public class Panel_loading {

    public Panel_loading(JPanel removePanel, JPanel addPanel) {
        removePanel.removeAll();
        removePanel.repaint();
        removePanel.revalidate();
        removePanel.add(addPanel);
        removePanel.repaint();
        removePanel.revalidate();
        addPanel.setBounds(0, 0, addPanel.getWidth(), addPanel.getHeight());
    }

}
