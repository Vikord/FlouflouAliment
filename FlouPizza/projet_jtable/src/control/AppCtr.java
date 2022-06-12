/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JFrame;


public class AppCtr {


    public static void main(String[] args) {
        Fen fenetre = new Fen();
        fenetre.setSize(490, 300);
        fenetre.setTitle("Liste des dépenses");
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null);
        
        fenetre.setVisible(true);
    }
    
}
