/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
/**
 *
 * @author Haifa
 */
public class panneau extends JPanel {
    public void paint(Graphics f){
        System.out.print("je suis exécuté");
        f.fillOval(20, 20, 20, 20);
        Font font = new Font("Courier", Font.BOLD, 20);
    f.setFont(font);
    f.setColor(Color.red);
    f.drawString("Tiens ! Le Site du Zéro !", 10, 20);
    }
}
