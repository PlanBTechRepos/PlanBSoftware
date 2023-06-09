
package com.pdvtech.view.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class ActionButton extends JButton {
    
    private boolean mousePressed;
    
    public ActionButton() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);
        int x = (width - size) / 2;
        int y = (height - size) / 2;
        
        //Alterações visuais: cor de clique nos botões de ação
        if (mousePressed) {
            //Cor do botão pressionado
            g2.setColor(new Color(126, 172, 247));
        } else {
            //Cor padrão, botão solto
            g2.setColor(new Color(215, 215, 215));
        }
        
        g2.fill(new Ellipse2D.Double(x, y, size, size));
        g2.dispose();
        
        super.paintComponent(g); 
    }
}