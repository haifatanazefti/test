/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Haifa
 */
public class fenetre extends JFrame  {

    public fenetre() {
    this.setVisible(true); 
            this.setTitle("bienvenue dans la fenetre "); 
            this.setSize(400,200); 
            // centrer la fenetre
            this.setLocationRelativeTo(null);
            // si on clique sur croi le run se termine 
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // aggrandir et diminuer la taille du fenetre 
            this.setResizable(true);
            JPanel p = new JPanel();
       
            System.out.print(p.getWidth());
            p.setBackground(Color.red);
            // dire a jframe que son contenu est jpanel
            this.setContentPane(new panneau()); 
            
    }
    
}
