
package com.pdvtech.view.component.util;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class CustomTableScrollbar extends JScrollBar {

    public CustomTableScrollbar() {
        setUI(new ScrollbarUI());
        
        //Alterações visuais: cores e dimensões
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(new Color(30, 30, 30));
    }
}
