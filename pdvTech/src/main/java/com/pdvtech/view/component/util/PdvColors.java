
package com.pdvtech.view.component.util;

import java.awt.Color;
import javax.swing.JPanel;

public class PdvColors {
    
    static public void setColor(JPanel panel) {
        panel.setBackground(new Color(115, 162, 239));
    }
    
    static public void resetColor(JPanel panel) {
        panel.setBackground(new Color(102, 102, 102));
    }
}
